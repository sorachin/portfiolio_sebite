import Vue from 'vue';
import VueRouter from 'vue-router';
import MainView from '@/views/mainView.vue';
import login from '@/views/user/login.vue';
import Join from '@/views/user/join.vue';
import addressmodal from '@/components/user/AddressForm.vue';

import templateChoice from '@/views/portfolio/templateChoice.vue';
import jobChoice from '@/views/portfolio/jobChoice.vue';
import workExp from '@/views/portfolio/workExp.vue';
import finalPortfolio from '@/views/portfolio/finalPortfolio.vue';

import about from '@/views/about.vue'
import help from '@/views/help.vue';

import Resume from '@/components/resume.vue';
import test from '@/views/resumes/test.vue'
import portfolio2 from '@/views/resumes/portfolio2.vue'
Vue.use(VueRouter);


export const router = new VueRouter({
  mode: 'history',
  routes:[
    {
      path: '/',
      name: 'Home',
      component: MainView,
    },
    {
        path: '/user/login',
        name: 'Login',
        component: login,
    },
    {
      path: '/user/signup',
      name: 'SignUp',
      component: Join
    },
    {
      path: '/addressmodal',
      name: 'addressmodal',
      component: addressmodal
    },
    {
      path: '/resume/:resumeid',
      name: 'resume',
      component: Resume
    },
    // 포트폴리오 
    {
      path: 'template',
      name: 'templateChoice',
      component: templateChoice
    },
    {
      path: 'portfolio/job',
      name: 'jobChoice',
      component: jobChoice
    },
    {
      path: 'portfolio/work',
      name: 'workExp',
      component: workExp
    },
    {
      path: 'portfolio/final',
      name: 'finalPortfolio',
      component: finalPortfolio
    },
    // About
    {
      path: '/about',
      name: 'about',
      component: about
    },
    // Help
    {
      path: '/help',
      name: 'help',
      component: help
    },
    {
      path: '/test',
      name: 'test',
      component: test
    },
    {
      path: '/portfolio2',
      name: 'portfolio2',
      component: portfolio2
    },

  ]
});