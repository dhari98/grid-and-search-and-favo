package com.example.mybestapp

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room


@Database(entities = [Example4::class], version = 1)
abstract class FavoriteDatabase : RoomDatabase() {

    abstract fun favoriteDao(): FavoriteDao?

    companion object {
        private var faveDB: FavoriteDatabase? = null
        fun getInstance(context: Context): FavoriteDatabase? {
            if (null == faveDB) {
                faveDB = buildDatabaseInstance(context)
            }
            return faveDB
        }

        private fun buildDatabaseInstance(context: Context): FavoriteDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                FavoriteDatabase::class.java,
                "FAV"
            ).allowMainThreadQueries().build()
        }

        fun cleanUp() {
            faveDB = null
        }

    }

}

