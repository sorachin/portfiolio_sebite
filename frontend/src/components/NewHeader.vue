<template>
  <v-app-bar app color="white" height="80">
    <!-- <router-link :to="{ name:'Home' }"><h1>포잘알</h1></router-link> -->
    <h1>포잘알</h1>

    <div id="nav_menu">
      <ul>
        <li><router-link :to="{ name: 'Home' }">Main</router-link></li>
        <li>
          <router-link :to="{ name: 'templateChoice' }">Portfolio</router-link>
        </li>
        <li><router-link :to="{ name: 'about' }">About</router-link></li>
        <li><router-link :to="{ name: 'help' }">Help</router-link></li>
        <li v-if="!this.$cookies.isKey('auth-token')">
          <router-link :to="{ name: 'SignUp' }">Singup</router-link>
        </li>
        <li v-if="!this.$cookies.isKey('auth-token')">
          <router-link :to="{ name: 'Login' }">Login</router-link>
        </li>
        <li v-if="this.$cookies.isKey('auth-token')">
          <router-link to="/logout" @click.native="logout"
            >로그아웃</router-link
          >
        </li>
      </ul>
    </div>
  </v-app-bar>
</template>

<script>
import axios from "axios";
import constants from "../constants.js";

const BACKEND_URL = constants.URL;

export default {
  name: "NewHeader",
  data() {
    return {};
  },
  methods: {
    home: function () {
      this.$router.push({ name: "Home" });
    },
    logout: function () {
      this.$cookies.remove("auth-token");
      axios.get(BACKEND_URL + "user/logout").then((response) => {
        if (response.data.status) {
          alert("로그아웃 성공");
          alert(response.data.object);
        }
        this.$store.commit("logout");
        location.reload();
      });
    },
  },
};
</script>

<style scoped>
#nav_menu ul {
  list-style-type: none;
  padding: 1px 5px 5px 1px;
}

#nav_menu ul li {
  display: inline;
  border-left: 1px solid #c0c0c0;
  padding: 0px 10px 0px 10px;
  margin: 5px 0px 5px 0px;
  color: black;
  font-size: 15pt;
  /* font-family: SongMyung-Regular; */
  font-family: NanumBarunpenB;
  line-height: 4.5;
}

#nav_menu ul li:first-child {
  border-left: none;
}

#nav_menu a {
  text-decoration: none;
  color: black;
}

#nav_menu a:hover {
  color: #64718c;
  border-bottom: 3px solid #f2d0d0;
}
</style>

