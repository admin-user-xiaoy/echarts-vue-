<template>
  <div><div id="echartContainer" style="width:100%; height:500px"></div></div>
</template>

<script>

export default {
  name: "Data4",
  data(){
    return{

    };
  },
  mounted() {
    this.drawBarChart()
  },
  methods:{
      drawBarChart(){
        var myChart = this.$echarts.init(document.getElementById('echartContainer'), 'infographic');
        var  option = {
          xAxis: {
            type: 'category',
            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
          },
          yAxis: {
            type: 'value'
          },
          series: [
            {
              data: [120, 200, 150, 80, 70, 110, 130],
              type: 'bar'
            }
          ]
        };
        myChart.setOption(option);
      }
    }

}
</script>

<style scoped>

</style>