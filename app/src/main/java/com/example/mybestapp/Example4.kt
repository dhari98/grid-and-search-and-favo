
package com.example.mybestapp


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Example4(


    @ColumnInfo val imageViewLike: Int,

    @ColumnInfo val imageViewSound: Int,

    @ColumnInfo val text1: String,

    @ColumnInfo val text2: String,

    @ColumnInfo val text3: String,

    @PrimaryKey
    val id: Int = -1,

    @ColumnInfo val isFavorite: Boolean = true
)



/*
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "favoritelist")
class Example4 {


    @PrimaryKey
    var id = 0
    @ColumnInfo
    var imageViewLike: Int? = null

    @ColumnInfo
    var imageViewSound: Int? = null

    @ColumnInfo(name = "hindi")
    var text1: String? = null
    @ColumnInfo(name = "hindi")
    var text2: String? = null
    @ColumnInfo(name = "hindi")
    var text3: String? = null

}





 */



/*
@file:Suppress("AndroidUnresolvedRoomSqlReference")

package com.example.mybestapp

import androidx.room.*


@Entity
data class Example4(

    val ID:Int,

    val   imageViewLike: Int,
    val imageViewSound: Int,
      val text1: String,
      val text2: String,
      val text3: String

    //@ColumnInfo(name = "text1")

    )

@Dao
interface Fav{

    @Insert
    fun insert (vararg fav: Fav)

    @Delete
    fun delete (vararg fav: Fav)

 //   @Query("Select * from Fav")


    @Query("SELECT * FROM Example4 WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Example4>


}
@Database(entities = [Example4::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): Fav
}

 */