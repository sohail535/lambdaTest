package kLambda

import dagger.Binds
import dagger.Module

@Module
interface DatabaseModule {
    @Binds
    fun getDatabase(SQLite: SQLite): IDatabase
}