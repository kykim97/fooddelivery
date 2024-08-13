<template>
    <v-card outlined>
        <v-card-title>
            SubmitRating
        </v-card-title>

        <v-card-text>
            <UUID offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <Number label="Rating" v-model="value.rating" :editMode="editMode"/>
            <String label="Comment" v-model="value.comment" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="submitRating"
            >
                SubmitRating
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SubmitRatingCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = {};
            this.value.rating = 0;
            this.value.comment = '';
        },
        watch: {
        },
        methods: {
            submitRating() {
                this.$emit('submitRating', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

