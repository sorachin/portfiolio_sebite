<template>
  <div>
    <div id="hot-bod">
      <h1>스스로 만드는 포트폴리오</h1>
      <p>컴퓨터에 능숙하지 않은 당신을 위한 사이트</p>
      <p>
        Integer lobortis porta risus, non malesuada orci dictum eget. Nulla
        fringilla suscipit felis sit amet laoreet. Aliquam non sem lacinia,
        consequat eros aliquet, porttitor
      </p>
      <h1>I'M A LITTLE DIFFERENT</h1>
      <div class="two-img">
        <img
          src="https://pbs.twimg.com/profile_images/509915895808798721/UTPNaKoC.jpeg"
        />
      </div>
      <p id="test">
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean maximus
        pellentesque urna a viverra. Proin aliquam lorem et sapien maximus, a
        luctus arcu vehicula. In et feugiat tortor, at convallis lectus. Duis
        sapien ante, posuere ultricies mauris ut, elementum gravida metus.
        Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere
        cubilia Curae; Duis eget enim lectus. Vestibulum ac sagittis sem. Nullam
        dictum sem sem, a lobortis libero dictum quis. Donec tellus risus,
        gravida ac augue ac, tempus efficitur justo. Cras dignissim metus ipsum,
        sit amet semper nulla vehicula vitae. Nunc a nunc in lorem iaculis
        elementum. Sed ultricies posuere mauris, eu fringilla diam iaculis ut.
        Quisque porttitor semper sem in tincidunt.
      </p>

      <h1>ALLOW ME TO SHOW OFF</h1>

      <div id="portfolio">
        <div id="card-pic"></div>
        <ul>
          <li>NEXT ONE!</li>
          <li>GO BACK!</li>
          <!--       <li> 1 of 5 </li> -->
        </ul>
        <div></div>
      </div>

      <p>
        Donec dapibus enim justo. Maecenas molestie nisi ut nunc malesuada, ac
        sollicitudin orci fringilla. Vivamus faucibus non felis non rutrum.
        Morbi vel convallis quam. In sodales ornare sem at feugiat. Sed
        vestibulum turpis
      </p>

      <h1>HOW IT ALL HAPPENED</h1>

      <h3>Focused on Photography in ...</h3>
    </div>
  </div>
</template>

<script>
export default {
  name: "Home",
  components: {},
  methods: {},
};
</script>

<style>
/* @import url(https://fonts.googleapis.com/css?family=Bree+Serif|Open+Sans); */

svg {
  height: 110%;
  z-index: 10;
  position: fixed;
  top: 0;
}



h2 {
  /*  background: rgba(0,0,0,0.5);  */
  color: white;
  font-size: 3em;
  text-shadow: 1px 2px #6b6b6b;
  margin: 0;
}

body {
  margin: 0;
}

#hot-bod {
  text-align: justify;
  width: 50%;
  margin: 0 auto;
  padding-left: 5%;
  font-family: "Open Sans", sans-serif;
  color: #4c4c4c;
  line-height: 2;
}

a {
  text-decoration: none;
  color: #3373b9;
}

a:hover {
  color: #119fc2;
}

h3 {
  margin: 5% 0 0 0;
  font-size: 2em;
  margin-bottom: 0;
  line-height: 1.1;
  text-align: left;
  /*   font-family: 'bree serif', serif; */
}

ul {
  list-style-type: none;
}

ul li {
  display: block;
}

/* h1 {
  font-family: 'bree serif', serif;
  color: #9bcb52;
  font-size: 3em;
  text-shadow: 1px 2px #7ea342;
} */

.two-img img {
  width: 49.5%;
}

#portfolio ul {
  position: absolute;
  top: right;
  width: 9%;
  display: inline-block;
  margin: 0;
  padding: 0;
}

#portfolio li {
  height: 80px;
  background-color: #3f90a6;
  text-align: center;
  color: white;
}

#portfolio li:first-child {
  border-top-right-radius: 10px;
}

#portfolio li:last-child {
  border-top: 1px solid black;
  border-bottom-right-radius: 10px;
}

#portfolio li:hover {
  background-color: #2e798c;
}

#card-pic {
  width: 80%;
  height: 300px;
  background-image: url("https://www.wired.com/images_blogs/business/2010/11/Geocities.jpg");
  display: inline-block;
  border-radius: 15px 0px 15px 15px;
}

@import url(https://fonts.googleapis.com/css?family=Lato:100,300,400);

input::-webkit-input-placeholder,
textarea::-webkit-input-placeholder {
  color: #aca49c;
  font-size: 0.875em;
}

input:focus::-webkit-input-placeholder,
textarea:focus::-webkit-input-placeholder {
  color: #bbb5af;
}

input::-moz-placeholder,
textarea::-moz-placeholder {
  color: #aca49c;
  font-size: 0.875em;
}

input:focus::-moz-placeholder,
textarea:focus::-moz-placeholder {
  color: #bbb5af;
}

input::placeholder,
textarea::placeholder {
  color: #aca49c;
  font-size: 0.875em;
}

input:focus::placeholder,
textarea::focus:placeholder {
  color: #bbb5af;
}

input::-ms-placeholder,
textarea::-ms-placeholder {
  color: #aca49c;
  font-size: 0.875em;
}

input:focus::-ms-placeholder,
textarea:focus::-ms-placeholder {
  color: #bbb5af;
}

/* on hover placeholder */

input:hover::-webkit-input-placeholder,
textarea:hover::-webkit-input-placeholder {
  color: #e2dedb;
  font-size: 0.875em;
}

input:hover:focus::-webkit-input-placeholder,
textarea:hover:focus::-webkit-input-placeholder {
  color: #cbc6c1;
}

input:hover::-moz-placeholder,
textarea:hover::-moz-placeholder {
  color: #e2dedb;
  font-size: 0.875em;
}

input:hover:focus::-moz-placeholder,
textarea:hover:focus::-moz-placeholder {
  color: #cbc6c1;
}

input:hover::placeholder,
textarea:hover::placeholder {
  color: #e2dedb;
  font-size: 0.875em;
}

input:hover:focus::placeholder,
textarea:hover:focus::placeholder {
  color: #cbc6c1;
}

input:hover::placeholder,
textarea:hover::placeholder {
  color: #e2dedb;
  font-size: 0.875em;
}

input:hover:focus::-ms-placeholder,
textarea:hover::focus:-ms-placeholder {
  color: #cbc6c1;
}

body {
  font-family: "Lato", sans-serif;
  background: #e2dedb;
  color: #b3aca7;
}

header {
  position: relative;
  margin: 100px 0 25px 0;
  font-size: 2.3em;
  text-align: center;
  letter-spacing: 7px;
}

#form {
  position: relative;
  width: 500px;
  margin: 50px auto 100px auto;
}

input {
  font-family: "Lato", sans-serif;
  font-size: 0.875em;
  width: 470px;
  height: 50px;
  padding: 0px 15px 0px 15px;

  background: transparent;
  outline: none;
  color: #726659;

  border: solid 1px #b3aca7;
  border-bottom: none;

  transition: all 0.3s ease-in-out;
  -webkit-transition: all 0.3s ease-in-out;
  -moz-transition: all 0.3s ease-in-out;
  -ms-transition: all 0.3s ease-in-out;
}

input:hover {
  background: #b3aca7;
  color: #e2dedb;
}

textarea {
  width: 470px;
  max-width: 470px;
  height: 110px;
  max-height: 110px;
  padding: 15px;

  background: transparent;
  outline: none;

  color: #726659;
  font-family: "Lato", sans-serif;
  font-size: 0.875em;

  border: solid 1px #b3aca7;

  transition: all 0.3s ease-in-out;
  -webkit-transition: all 0.3s ease-in-out;
  -moz-transition: all 0.3s ease-in-out;
  -ms-transition: all 0.3s ease-in-out;
}

textarea:hover {
  background: #b3aca7;
  color: #e2dedb;
}

#submit {
  width: 502px;

  padding: 0;
  margin: -5px 0px 0px 0px;

  font-family: "OPEN SANS", sans-serif;
  font-size: 0.875em;
  color: #b3aca7;

  outline: none;
  cursor: pointer;

  border: solid 1px #b3aca7;
  border-top: none;
}

#submit:hover {
  color: #e2dedb;
}
</style>
