package com.example.mybestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.example_item4.*

class MainActivity3 : AppCompatActivity() {

  private var imageViewLike: Button? =  null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val users3 = ArrayList<Example4> ()

        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              0","صفر              ","صفر              ",0))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              0","صفر              ","صفر              ",1))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                1","بير                ","واحد              ",2))

        /*
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                2","إكي               ","اثنان              ",3))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                3","إِوچ               ","ثلاثة              ",4))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              4","دورت              ","اربعة               ",5))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              5","بَيش              ","خمسة              ",6))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              6","ٱلت ِ             ","ستة              ",7))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"             7","يَدي              ","سبعة             ",8))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            8","سَكيز             ","ثمانية             ",9))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            9","دوكوز             ","تسعة              ",10))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"               10","أَون               ","عشرة              ",11))

        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            9","دوكوز             ","تسعة              ",12))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"               10","أَون               ","عشرة              ",13))
         */



        recycler3.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val adapter1= ExampleAdapter3 (users3)
        recycler3.adapter= adapter1





      //  imageViewLike = findViewById<View>(R.id.imageViewLike) as Button
        imageViewLike?.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity3,
                    FavoActivity::class.java
                )
            )



        }
    }
}

        /*
        imageViewLike = findViewById<View>(R.id.imageViewLike) as Button
        imageViewLike!!.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    FavoActivity::class.java
                )
            )
        }



        favoriteDatabase = Room.databaseBuilder(
            applicationContext, FavoriteDatabase::class.java, "myfavdb"
        ).allowMainThreadQueries().build()

    }




    companion object {


      // private const val cleanUp = "http://technovimal.in/apps/fast-english/beers.json"
        @JvmField
       var favoriteDatabase: FavoriteDatabase? = null
    }
}





         */
