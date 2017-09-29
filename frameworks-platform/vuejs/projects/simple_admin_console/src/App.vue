<template>
  <div id="app">
    <app-nav></app-nav>
    <app-view>
       <app-sidebar></app-sidebar>
       <app-content>
         <router-view></router-view>
       </app-content>
    </app-view>

  </div>
</template>

<script>
export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
