package com.example.mybestapp



import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FavoriteDao {
    @Insert
    fun addData(example4: Example4?)

    @get:Query("select * from example4")
    val favoriteData: List<Example4?>?

    @Query("SELECT EXISTS (SELECT 1 FROM example4 WHERE id=:id)")
    fun isFavorite(id: Int): Int

    @Delete
    fun delete(example4: Example4?)
}