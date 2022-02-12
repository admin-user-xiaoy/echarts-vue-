<template>
  <div class="Echarts">
    <div id="main" style=" position:relative;width: 100%;height: 400px;"></div>
    <h4>python语言作为目前世界主流发展趋势的编程语言，其行业工资亦然是我们的关注重点。从柱状图中可以看出，其工资状况呈正态分布，工资主要集中在一万到五万之间，有一些外企公司的工资更是达到几十k。不难看出，python的整体工资水平是相当不错的。</h4>
  </div>
</template>


<script>

import * as echarts from 'echarts';
import axios from "axios";
export default {
  name: 'Echarts',
  data (){
    return {
      msg: "error:chart"
    }

  },
  methods: {
    myEcharts(){

      var myChart = echarts.init(document.getElementById('main'));
      //配置图表
      var option = {
        title: {
          text: '工资范围'

        },
        tooltip: {},
        legend: {
          data: ['工资人数']
        },
        xAxis: {
          data: []
        },
        yAxis: {},
        series: [{
          name: '工资人数',
          type: 'bar',
          data: []
        }]
      };
      axios.get("http://106.55.226.71:8080/personcount/personcount/list").then(res=>{
        const data=res.data
        let name = data.map(item=>{
          return item.gear
        })
        option.xAxis.data=name
        res.data.forEach(item => {
          option.series[0].data.push(item.count)
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

<style>

</style>
