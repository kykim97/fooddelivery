
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManagementOrderManager from "./components/listers/OrderManagementOrderCards"
import OrderManagementOrderDetail from "./components/listers/OrderManagementOrderDetail"

import FoodPreparationRestaurantManager from "./components/listers/FoodPreparationRestaurantCards"
import FoodPreparationRestaurantDetail from "./components/listers/FoodPreparationRestaurantDetail"

import DeliveryManagementDeliveryManager from "./components/listers/DeliveryManagementDeliveryCards"
import DeliveryManagementDeliveryDetail from "./components/listers/DeliveryManagementDeliveryDetail"

import RatingManagementRatingManager from "./components/listers/RatingManagementRatingCards"
import RatingManagementRatingDetail from "./components/listers/RatingManagementRatingDetail"

import AppManagementAppManager from "./components/listers/AppManagementAppCards"
import AppManagementAppDetail from "./components/listers/AppManagementAppDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderManagements/orders',
                name: 'OrderManagementOrderManager',
                component: OrderManagementOrderManager
            },
            {
                path: '/orderManagements/orders/:id',
                name: 'OrderManagementOrderDetail',
                component: OrderManagementOrderDetail
            },

            {
                path: '/foodPreparations/restaurants',
                name: 'FoodPreparationRestaurantManager',
                component: FoodPreparationRestaurantManager
            },
            {
                path: '/foodPreparations/restaurants/:id',
                name: 'FoodPreparationRestaurantDetail',
                component: FoodPreparationRestaurantDetail
            },

            {
                path: '/deliveryManagements/deliveries',
                name: 'DeliveryManagementDeliveryManager',
                component: DeliveryManagementDeliveryManager
            },
            {
                path: '/deliveryManagements/deliveries/:id',
                name: 'DeliveryManagementDeliveryDetail',
                component: DeliveryManagementDeliveryDetail
            },

            {
                path: '/ratingManagements/ratings',
                name: 'RatingManagementRatingManager',
                component: RatingManagementRatingManager
            },
            {
                path: '/ratingManagements/ratings/:id',
                name: 'RatingManagementRatingDetail',
                component: RatingManagementRatingDetail
            },

            {
                path: '/appManagements/apps',
                name: 'AppManagementAppManager',
                component: AppManagementAppManager
            },
            {
                path: '/appManagements/apps/:id',
                name: 'AppManagementAppDetail',
                component: AppManagementAppDetail
            },



    ]
})
