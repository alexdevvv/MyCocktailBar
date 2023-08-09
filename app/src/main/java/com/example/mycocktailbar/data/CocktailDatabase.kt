package com.example.mycocktailbar.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mycocktailbar.domain.CocktailEntity

@Database(entities = [CocktailEntity::class], version = 1)
abstract class CocktailDatabase: RoomDatabase() {

    abstract fun cocktailDao(): CocktailDao

    companion object {
        @Volatile
        private var INSTANCE: CocktailDatabase? = null

        fun getInstance(context: Context): CocktailDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CocktailDatabase::class.java,
                    "cocktail_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}