package com.example.mybestapp

import androidx.room.Database
import androidx.room.RoomDatabase



@Database(entities = [Example4::class], version = 1)
abstract class FavoriteDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao?
}

