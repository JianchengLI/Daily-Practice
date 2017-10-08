// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'
import App from './App.vue'
import AppNav from './layouts/AppNav.vue'
import AppSideBar from './layouts/AppSideBar.vue'

import router from './router'

Vue.use(ElementUI)
Vue.component('app-nav', AppNav)
Vue.component('app-sidebar', AppSideBar)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App }
})
