import Vue from 'vue'
import App from './App.vue'
import router from './router'
import *as echarts from "echarts";
import *as axios from 'axios'
Vue.config.productionTip = false
Vue.prototype.$echarts = echarts
Vue.prototype.$axios = axios


new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

