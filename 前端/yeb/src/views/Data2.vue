<template>
<div id="Date2">
  <div id="main" style="width: 100%;height: 500px"></div>
  <h4>由折线图可以看出，使用python语言的公司中，民营企业远远比国企和外企等要多得多，由互联网知识得知，这可能是因为国企在开发过程中java还是居多，未来肯定会越来越多的大公司加入python中，但需要一个过程，毕竟java生态圈根深蒂固，短时间难被取代。同时我们也可以根据私企所用python数量的增多，可以预见未来python必将在编程领域占据一席之地</h4>
</div>

</template>

<script>
import * as echarts from 'echarts';
import axios from "axios";
export default {
  name: "Data2",
  methods: {
    myEcharts() {
      const myChart = echarts.init(document.getElementById('main'));
      //配置图表
      const option = {
        title:{
          text:"企业性质",
          left:"center"
        },
        xAxis: {
          type: 'category',
          data: [ ]
        },
        yAxis: {
          type: 'value'
        },
        series: [
          {
            data: [],
            type: 'line'
          }
        ]
      };
    axios.get("http://106.55.226.71:8080/nature/nature/list").then(res =>{
      const data=res.data
      let name = data.map(item=>{
        return item.nature
      })
      option.xAxis.data=name
      res.data.forEach(item => {
        option.series[0].data.push(item.count)
      })
      myChart.setOption(option);
    })

    }
  },
  mounted() {
    this.myEcharts();
  }
}
</script>


