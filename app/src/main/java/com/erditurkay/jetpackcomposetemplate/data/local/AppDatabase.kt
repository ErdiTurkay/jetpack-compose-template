package com.erditurkay.jetpackcomposetemplate.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.erditurkay.jetpackcomposetemplate.data.dao.ExampleDao
import com.erditurkay.jetpackcomposetemplate.data.entity.ExampleEntity
import com.erditurkay.jetpackcomposetemplate.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [ExampleEntity::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getExampleDao(): ExampleDao

    class Callback @Inject constructor(
        private val database: Provider<AppDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope,
    ) : RoomDatabase.Callback()
}
