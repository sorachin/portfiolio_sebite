<template>
<div class="page-wrapper">
  <h3>{{firebaseData.name}}</h3>
  <div class="page" :id="$route.params.resumeid">
    <div class="page-inner">
      <component :is="$route.params.resumeid">
      </component>
    </div>
    
  </div>
</div>
</template>

<script>
import Vue from 'vue';
import '../views/resumes/resumes';
import {db} from '../firebase'
const documentPath = 'Users/user'
export default Vue.component('resume', {
    name: 'app',
    data(){
    return {
      firebaseData:null,
      formdata: {}
    };
  },
  firestore(){
    return {
      firebaseData: db.doc(documentPath)

    }

  },
});
</script>

<style scoped>
.page-inner{
  height: 100%;
  width: 100%;
}
.page-wrapper {
  overflow-x: hidden;
  background: #CCCCCC;
  margin: 0;
  padding: 0;
  -webkit-print-color-adjust: exact;
  box-sizing: border-box;
}

.resume {
  height: 100%;
  width: 100%;
}

.page {
  background: white;
  position: relative;
  width: 21cm;
  height: 29.68cm;
  display: block;
  page-break-after: auto;
  overflow: hidden;
}
</style>
