<template>
  <div id="dataMapecharts" style="width:100%;height:500px;"></div>
</template>
<script>
import * as echarts from "echarts";
import china from "@/assets/china";
import axios from "axios";

export default {
  data() {
    return {};
  },
  mounted() {
    this.myecharts();
  },
  methods: {
    myecharts() {

      //加载中国地图
      var myChart = echarts.init(
          document.getElementById("dataMapecharts")
      );
      // 绘制图表
      var chinaMap = {
        title: {
          //标题
          text: "省级统计公司个数",
          left: "center",
        },
        zoom: 5,
        tooltip: {
          //鼠标移动到某个省份时显示内容
          show: true,
          formatter: function (item)   {
            let resData = item.data;
            console.log(item, resData);
            if (resData) {
              return "省份:" + resData.name + "<br/>" + "数量:" + resData.value;
            }
          },
        },
        selectedMode: "single",
        geo: {
          // 设置地图的显示信息
          map: "china", // 注意  哪个区域的就显示哪个区域的名称
          label: {
            show: true,
            normal: {
              show: true,
              textStyle: {
                color: "#000",
                fontSize: 12,
              },
            },
            emphasis: {
              show: true,
            },
          },
          roam: false,
          itemStyle: {
            normal: {
              borderColor: "#ccc",
              areaColor: "#e0f3f8",
            },
            emphasis: {
              areaColor: "#9DD4F4",
              shadowColor: "rgba(0, 0, 0, 0.5)",
            },
          },
            left: "5%",
            right: "5%",
            top: "5%",
            bottom: "5%",
        },
        series: [
          {
            type: "map",
            geoIndex: 0, // 不可缺少，否则无tooltip 指示效果
            data: [

            ],
          },
        ],
        dataRange: {//给各个省份设置不同颜色
          x: "-1000 px", //图例横轴位置
          y: "-1000 px", //图例纵轴位置
          splitList: [
            {
              start: 1,
              end: 1,
              label: "北京",
              color: "#EC5D2A",
              show:true
            },
            { start: 0, end: 0, label: "天津", color: "white" },
            { start: 203, end: 203, label: "上海", color: "#feffdb" },
            { start: 4, end: 4, label: "重庆", color: "#e0cee4" },
            { start: 5, end: 5, label: "河北", color: "#fde8cd" },
            { start: 6, end: 6, label: "河南", color: "#e4f1d7" },
            { start: 7, end: 7, label: "云南", color: "#fffed7" },
            { start: 8, end: 8, label: "辽宁", color: "#e4f1d7" },
            { start: 9, end: 9, label: "黑龙江", color: "#e4f1d7" },
            { start: 10, end: 10, label: "湖南", color: "#fffed7" },
            { start: 11, end: 11, label: "安徽", color: "#fffed8" },
            { start: 12, end: 12, label: "山东", color: "#dccee7" },
            { start: 13, end: 13, label: "新疆", color: "#fffed7" },
            { start: 14, end: 14, label: "江苏", color: "#fce8cd" },
            { start: 15, end: 15, label: "浙江", color: "#ddceeb" },
            { start: 16, end: 16, label: "江西", color: "#e4f1d3" },
            { start: 17, end: 17, label: "湖北", color: "#fde8cd" },
            { start: 18, end: 18, label: "广西", color: "#fde8cd" },
            { start: 19, end: 19, label: "甘肃", color: "#fde8cd" },
            { start: 20, end: 20, label: "山西", color: "#fffdd6" },
            { start: 21, end: 21, label: "内蒙古", color: "#ddcfe6" },
            { start: 22, end: 22, label: "陕西", color: "#fad8e9" },
            { start: 23, end: 23, label: "吉林", color: "#fce8cd" },
            { start: 24, end: 24, label: "福建", color: "#fad8e8" },
            { start: 25, end: 25, label: "贵州", color: "#fad8e8" },
            { start: 198, end: 198, label: "广东", color: "#ddcfe8" },
            { start: 27, end: 27, label: "青海", color: "#fad8e9" },
            { start: 28, end: 28, label: "西藏", color: "#ddcfe6" },
            { start: 29, end: 29, label: "四川", color: "#e4f1d5" },
            { start: 30, end: 30, label: "宁夏", color: "#fefcd5" },
            { start: 31, end: 31, label: "海南", color: "#fad8e9" },
            { start: 32, end: 32, label: "台湾", color: "#fce8cd" },
            { start: 33, end: 33, label: "香港", color: "#dc9bbb" },
            { start: 34, end: 34, label: "澳门", color: "#e0f7cc" },
            { start: 50, end: 50, label: "北京", color: "#e0f7cc" },
          ],
        }, //各省地图颜色；start：值域开始值；end：值域结束值；label：图例名称；color：自定义颜色值；名字与json对应，（start: 1,  end: 1）是data数组的key值

      };
    axios.get("http://106.55.226.71:8080/china/china/list").then( res =>{
          res.data.forEach(item =>{
            console.log(item)
            chinaMap.series[0].data.push({value:item.count,name:item.province})
          })


      myChart.setOption(chinaMap);
    })
      window.addEventListener("resize", function () {
        myChart.resize();
      });
    },
  },
};
</script>

