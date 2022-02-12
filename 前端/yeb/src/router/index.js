import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Data1.vue')
  },
  {
    path: '/date1',
    name: 'Date1',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Data3.vue')
  },
  {
    path: '/data2',
    name: 'Data2',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/Data2.vue')
  },
  {
    path:'/data3',
    name:'Data4',
    component: () => import('../views/Data4')
  },
  {
    path:'/data4',
    name:'Data5',
    component: () => import('../views/Data5')
  }

]

const router = new VueRouter({
  routes
})

export default router
