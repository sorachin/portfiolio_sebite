<template>
    <div>
    <h1>템플릿 고르는 페이지</h1>
    <div v-b-modal.modal-prevent-closing> 
        <h3 v-if="submittedNames.length === 0">
            Testing
        </h3>
            <div v-for="(name,index) in submittedNames" :key="name" >
                <h3 v-if="index == submittedNames.length-1">
                    {{ name }}
                </h3>
                 </div>
    </div>
   

    <b-modal
      id="modal-prevent-closing"
      ref="modal"
      title="Title"
      @show="resetModal"
      @hidden="resetModal"
      @ok="handleOk"
    >
      <form ref="form" @submit.stop.prevent="handleSubmit">
        <b-form-group
          :state="nameState"
          label="Name"
          label-for="name-input"
          invalid-feedback="Name is required"
        >
          <b-form-input
            id="name-input"
            v-model="name"
            :state="nameState"
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
        name: '',
        nameState: null,
        submittedNames: []
      }
},
    methods: {
      checkFormValidity() {
        const valid = this.$refs.form.checkValidity()
        this.nameState = valid
        return valid
      },
      resetModal() {
        this.name = ''
        this.nameState = null
      },
      handleOk(bvModalEvt) {
        // Prevent modal from closing
        bvModalEvt.preventDefault()
        // Trigger submit handler
        this.handleSubmit()

      },
      handleSubmit() {
        // Exit when the form isn't valid
        if (!this.checkFormValidity()) {
          return
        }
        // Push the name to submitted names
        this.submittedNames.push(this.name)
        // Hide the modal manually
        this.$nextTick(() => {
          this.$bvModal.hide('modal-prevent-closing')
          
        })
      }
    }
}
</script>
<style>

</style>