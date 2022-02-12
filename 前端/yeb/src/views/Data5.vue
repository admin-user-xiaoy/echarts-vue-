<template>
  <div style="padding: 10px">
    <div id="myChart" style="height: 600px;width: 600px;align-content: center"> </div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
import axios from "axios";

export default {
  name: "Data5",
  data() {
    return {}
  },
  mounted() {
    this.drawLine();
  },
  methods: {
    drawLine() {
      // 基于准备好的dom，初始化echarts实例
      let myChart = echarts.init(document.getElementById('myChart'))
      let option = {
        title: {
          text: '各地区用户比例统计图',
          subtext: '虚拟数据',
          left: 'left'
        },
        tooltip: {
          trigger: 'item'
        },
        legend: {
          trigger: 'item'
        },
        toolbox: {
          show: true,
          feature: {
            mark: {show: true},
            dataView: {show: true, readOnly: false},
            restore: {show: true},
            saveAsImage: {show: true}
          }
        },
        series: [
          {
            name: '用户',
            type: 'pie',
            radius: [50, 250],
            center: ['50%', '50%'],
            roseType: 'area',
            itemStyle: {
              borderRadius: 8
            },
            data: []
          }
        ]
      }
      axios.get("http://106.55.226.71:8080/test/list").then(res => {

          res.data.forEach(item => {
            console.log(option.series[0].data)
            option.series[0].data.push({value:item.password,name:item.name})
          })

          // 绘制图表
          myChart.setOption(option);

      })

    }
  }
}
</script>

<style scoped>

</style>
