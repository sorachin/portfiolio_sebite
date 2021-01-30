<template>
  <div>
    <div class="cool-img" id="img1">
        <br><br><br><br><br><br>
        <p>
          <a>포</a>트폴리오,
          <a>잘 </a>
          <a>알</a>고 만들자

          <transition-group tag="div" class="title">
            <span v-for="el in text" :key="el.id" class="item" v-text="el.text" style="color:white"/>
          </transition-group>
        </p>
    </div>
    <div class="merit-img">
      <div class="merit">
        <img src="../assets/time.png"/>
        <p>
          <a>Time</a><br>
          Quick and easy way to transform your resume into creative design using our online resume builder. 
          Which offers tons of features.
        </p>
      </div>
      <div class="merit">
        <img src="../assets/flexible.png"/>
        <p>
          <a>Flexible</a><br>
          All of our resume designs are very flexible and goes well with any industry like lawyers, accountants, graphic designer, software developer.
        </p>
      </div>
      <div class="merit" style="margin-right:0px">
        <img src="../assets/security.png">
        <p>
          <a>Security</a><br>
          We never share your personal information to any third party companies. 
          When you use our website, we give guarantee that your data is safe with us!
        </p>
      </div>
    </div>

    <div class = "latest">
      
    </div>
  </div>
</template>

<script>
export default {
  props: {
  },
  data() {
    return {
      autoplay: true,
      timer: null,
      index: 0,
      // 원본 메시지
      original: [
        '경력, 교육, 나의 흔적을 담은 세상에 단 하나뿐인',
        '나만의 감성을 담은 포트폴리오, 직접 제작해보세요!',
        '어려운 기술, 복잡한 지식없이도 충분히 가능합니다.'
      ],
      // 분해한 메시지
      messages: [],
      text: ''
    }
  },
  computed: {
    editor: {
      get() { return this.text.map(e => e.text).join('') },
      set(text) { this.text = this.convText(text) }
    }
  },
  watch: {
    autoplay(val) {
      clearTimeout(this.timer)
      if (val) {
        this.ticker()
      }
    }
  },
  methods: {
    // 데모 전용 타이머
    ticker() {
      this.timer = setTimeout(() => {
        if (this.autoplay) {
          this.index = this.index < this.messages.length-1 ? this.index + 1 : 0
          this.text = this.messages[this.index]
          this.ticker()
        }
      }, 5000)
    },
    // 텍스트를 분리해서 객체로 리턴하기
    convText(text) {
      const alms = {}
      const result = text.split('').map(el => {
        alms[el] = alms[el] ? ++alms[el] : 1
        return { id: `${el}_${alms[el]}`, text: el }
      })
      return Object.freeze(result) // 감시하지 않음
    }
  },
  created() {
    this.messages = this.original.map(el => this.convText(el))
    this.text = this.messages[0]
    this.ticker()
  }
}
</script>

<style>
/* @import url(https://fonts.googleapis.com/css?family=Bree+Serif|Open+Sans); */

svg {
  height: 110%;
  z-index: 10;
  position: fixed;
  top: 0;
}

.cool-img {
  height: 500px;
  width: 100%;
  margin-top: -10%;
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-position: center;
  background-size: cover;
  text-align: center;
}

.cool-img p {
  width: 75%;
  margin: 0 auto;
  padding: 3%;
  text-align: center;
  color: white;
  font-size:35px;
  font-family: NanumBarunpenB; 
}

.cool-img a {
  font-size: 72px;
}

.title {
  font-size: 2rem;
}
.item {
  display: inline-block;
  min-width: 0.3em;
}
/* 트랜지션 전용 스타일 */
.v-enter-active,
.v-leave-active,
.v-move {
  transition: all 1s;
}
.v-leave-active {
  position: absolute;
}
.v-enter,
.v-leave-to {
  opacity: 0;
  transform: translateY(-30px);
}

#img1 {
  /* background-image: url("https://3.bp.blogspot.com/-z6_8ecMh-LE/UpFbOOygBJI/AAAAAAAAAjc/vhNnRqbvWIg/s640/2013_kidsphotoshoot-94.jpg"); */
  background-image: url("../assets/main.jpg");
  /* opacity: 0.8; */
}

.merit-img {
  display: flex;
  /* margin-top: 5%; */
  /* margin-left: 2px; */
  padding:3%;
  overflow: hidden;
}

.merit {
  padding: 3%;
  /* margin-left: 50px; */
  margin-right: 100px;
  float:left;
  align-items: center;
  width: 30%;
}

.merit img {
  width: auto;
  height: 180px;
  margin-bottom: 10px;
}

.merit p {
  width: 90%;
  font-size: 15px;
  text-align: center;
  color: black;
  font-family: NanumBarunpenB; 
}

.merit a {
  padding: 2%;
  font-size: 25px;
  font-weight: 900;
}

.latest {
  display: block;
  width: 100%;
  height: 500px;
  background-color: lightgray;
  margin-bottom: -10%;
}

body { font-family: NanumBarunpenB; }


</style>