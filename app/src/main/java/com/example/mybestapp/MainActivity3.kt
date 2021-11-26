package com.example.mybestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {

    private var imageViewLike: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val users3 = ArrayList<Example4> ()

        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              0","صفر              ","صفر              ",0))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                1","بير                ","واحد              ",1))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                2","إكي               ","اثنان              ",2))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                3","إِوچ               ","ثلاثة              ",3))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              4","دورت              ","اربعة               ",4))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              5","بَيش              ","خمسة              ",5))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              6","ٱلت ِ             ","ستة              ",6))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"             7","يَدي              ","سبعة             ",7))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            8","سَكيز             ","ثمانية             ",8))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            9","دوكوز             ","تسعة              ",9))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"               10","أَون               ","عشرة              ",10))





        recycler3.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val adapter1= ExampleAdapter3 (users3)
        recycler3.adapter= adapter1

/*


        imageViewLike = findViewById<View>(R.id.accessibility_custom_action_1) as Button
        imageViewLike!!.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity3,
                    FavoActivity::class.java
                )
            )
        }
        favoriteDatabase = Room.databaseBuilder(
            applicationContext, FavoriteDatabase::class.java, "myfavdb"
        ).allowMainThreadQueries().build()

    }

    companion object {
        private const val HI = "http://technovimal.in/apps/fast-english/beers.json"
        @JvmField
        var favoriteDatabase: FavoriteDatabase? = null

 */
    }


}



