package kLambda

import dagger.Component

@Component
interface StoreFactory {
    fun store(): Store
}