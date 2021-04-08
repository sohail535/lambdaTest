package kLambda

import dagger.Component

@Component(modules = [DatabaseModule::class])
interface StoreFactory {
    fun store(): Store
}