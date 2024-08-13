<template>
    <v-card outlined>
        <v-card-title>
            PlaceOrder
        </v-card-title>

        <v-card-text>
            <UUID offline label="OrderId" v-model="value.orderId" :editMode="editMode" @change="change"/>
            <UUID offline label="RestaurantId" v-model="value.restaurantId" :editMode="editMode" @change="change"/>
            <String label="Menu" v-model="value.menu" :editMode="editMode"/>
            <String label="DeliveryLocation" v-model="value.deliveryLocation" :editMode="editMode"/>
            <String label="PaymentMethod" v-model="value.paymentMethod" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="placeOrder"
            >
                PlaceOrder
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
        name: 'PlaceOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.orderId = {};
            this.value.restaurantId = {};
            this.value.menu = '';
            this.value.deliveryLocation = '';
            this.value.paymentMethod = '';
        },
        watch: {
        },
        methods: {
            placeOrder() {
                this.$emit('placeOrder', this.value);
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

