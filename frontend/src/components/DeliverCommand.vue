<template>
    <v-card outlined>
        <v-card-title>
            Deliver
        </v-card-title>

        <v-card-text>
            <UUID offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <UUID offline label="DriverId" v-model="value.driverId" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deliver"
            >
                Deliver
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
        name: 'DeliverCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = {};
            this.value.driverId = {};
        },
        watch: {
        },
        methods: {
            deliver() {
                this.$emit('deliver', this.value);
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

