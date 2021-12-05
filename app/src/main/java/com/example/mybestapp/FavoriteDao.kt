package com.example.mybestapp


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface FavoriteDao {
    @Insert(onConflict = REPLACE)
    fun addData(example4: Example4?)

    @get:Query("select * from example4")
    val favoriteData: List<Example4?>?

    @Query("SELECT * FROM Example4 WHERE isFavorite = '1' ")
    fun getAllFavorites(): List<Example4>

    @Query("SELECT * FROM Example4 WHERE id = :id")
    fun getItem(id: Int): Example4?

/*
    @Query("SELECT * FROM Example4 WHERE id = :id")
    fun raw(id: Int): MediaPlayer?

 */


    @Delete
    fun delete(example4: Example4)


}