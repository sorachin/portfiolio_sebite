<template>
  <v-app id="app">
    <navigation/>
    
    <v-main>
      <v-container fluid class="mt-12">
        <router-view :key="$route.fullPath"></router-view>
      </v-container>
    </v-main>
  </v-app>

</template>

<script>
import axios from 'axios'
import constants from '../src/constants.js'
import NewHeader from '@/components/NewHeader.vue'

const BACKEND_URL = constants.URL

export default {
  data() {
    return {
      uid : this.$cookies.get('auth-token')
    }
  },
  components: {
    'navigation' : NewHeader,
  },
  methods : {
        logout : function () {
            this.$cookies.remove('auth-token');
            axios.get(BACKEND_URL + 'user/logout')
                .then(response => {
                    if (response.data.status){
                        alert("로그아웃 성공");
                        location.reload();
                        alert(response.data.object);
                    }
                    this.$store.commit('logout')
                    location.reload();
                })
        },
        // getLocation: function(){
        //   if(navigator.geolocation){
        //     console.log('geolocation is allowed')
        //     navigator.geolocation.getCurrentPosition(position => {
        //       var lat = position.coords.latitude
        //       var lon = position.coords.longitude
        //       console.log(this.$store,lat,lon)
        //       this.$store.commit('getLocation', [lat, lon])
        //     })
        //   }
        //   else{
        //     console.log('geolocation is not allowed')
        //   }
        // }
    },

    mounted(){
      //위치정보
      // this.getLocation()
      
    }
}
</script>
<style>

/* #app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
} */

@font-face {
  font-family: NanumBarunpenB;
  src : url('assets/NanumBarunpenB.otf');
}
</style>
