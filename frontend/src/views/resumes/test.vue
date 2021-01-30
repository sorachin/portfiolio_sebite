<template>
  <div>
    <div v-b-modal.modal-cname>
      <div v-if="submittedcname.length === 0">SSAFY</div>
      <div v-for="(cname, index) in submittedcname" :key="cname">
        <div v-if="index == submittedcname.length - 1">
          {{ cname }}
        </div>
      </div>
    </div>

    <b-modal
      id="modal-cname"
      ref="modal"
      title="Company's Name"
      @show="resetModal_cname"
      @hidden="resetModal_cname"
      @ok="handleOk_cname"
    >
      <form ref="form" @submit.stop.prevent="handleSubmit_cname">
        <b-form-group
          :state="cnameState"
          label="회사 명칭"
          label-for="cname-input"
          invalid-feedback="cname is required"
        >
          <b-form-input
            id="cname-input"
            v-model="cname"
            :state="cnameState"
            required
          ></b-form-input>
        </b-form-group>
      </form>
    </b-modal>
  </div>
</template>
<script>
export default {
  data() {
    return {
      cname: "",
      cnameState: null,
      submittedcname: [],
    };
  },
  methods: {
    checkFormValidity() {
      const valid = this.$refs.form.checkValidity();
      this.nameState = valid;
      return valid;
    },
    resetModal_cname() {
      this.cname = "";
      this.cnameState = null;
    },
    handleOk_cname(bvModalEvt) {
      // Prevent modal from closing
      bvModalEvt.preventDefault();
      // Trigger submit handler
      this.handleSubmit_cname();
    },
    handleSubmit_cname() {
      // Exit when the form isn't valid
      if (!this.checkFormValidity()) {
        return;
      }
      // Push the name to submitted names
      this.submittedcname.push(this.cname);
      // Hide the modal manually
      this.$nextTick(() => {
        this.$bvModal.hide("modal-cname");
      });
    },
  },
};
</script>
<style>
</style>