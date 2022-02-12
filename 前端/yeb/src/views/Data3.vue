<template>
  <div class="Date1">
    <title>top10</title>
    <div id="main" style="width: 100%;height: 85vh;color: #2c3e50" >
    </div>
  <h4>从饼状图中我们可以看出，python语言所涉及的行业领域非常广泛，图中计算机软件这一行业，毫无疑问是python的应用的主体，
    但也不乏可以看出python语言正在其他行业上的迅速发展。</h4>
  </div>
</template>

<script>
import * as echarts from 'echarts';
import axios from "axios";
export default {
  name: "Date1",
  methods: {
    myEcharts(){
      const myChart = echarts.init(document.getElementById('main'));
      //配置图表
      const option = {
        title:{
          text:"公司所属领域top10",
          left:"center"
        },
        tooltip: {
          trigger: 'item'
        },
        legend: {
          top: '5%',
          left: 'center',
          trigger: 'item'
        },
        series: [
          {
            name: '公司属性',
            type: 'pie',
            radius: ['40%', '70%'],
            avoidLabelOverlap: false,
            itemStyle: {
              borderRadius: 10,
              borderColor: '#fff',
              borderWidth: 2
            },
            label: {
              show: false,
              position: 'center'
            },
            emphasis: {
              label: {
                show: true,
                fontSize: '40',
                fontWeight: 'bold'
              }
            },
            labelLine: {
              show: false
            },
            data: []
          }
        ]
      };
      axios.get("http://106.55.226.71:8080/company/company/list").then(res =>{
        res.data.forEach(item => {
          console.log(res)
          // console.log(option.series[0].data)
          option.series[0].data.push({value:item.count,name:item.field})
        })

      myChart.setOption(option);
    })
    }

  },
  mounted(){
    this.myEcharts();
  }
}
</script>

<style scoped>

</style>
