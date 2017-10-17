<template>
  <el-row id="app">
    <app-sidebar></app-sidebar>
    <el-col id="app-context" :span="20">
      <app-nav></app-nav>
      <app-content>
         <router-view></router-view>
      </app-content>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
  html {
    height: 100%;
  }
  body {
    min-height: 100%;
  }
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

body{ margin: 0;}
</style>
