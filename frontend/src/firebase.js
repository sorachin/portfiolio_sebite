import firebase from 'firebase/app'
import 'firebase/firestore'

const firebaseApp = firebase.initializeApp({
        apiKey: "AIzaSyAE8c56f-s-8TCIaAskSyCEEn_dZ36YS4c",
        authDomain: "project-15f46.firebaseapp.com",
        databaseURL: "https://project-15f46.firebaseio.com",
        projectId: "project-15f46",
        storageBucket: "project-15f46.appspot.com",
        messagingSenderId: "833061662577",
        appId: "1:833061662577:web:346dd285bf1cb5e17f10d0",
        measurementId: "G-V9LP9CBVHE"
    });

const db = firebaseApp.firestore();

export { db };
