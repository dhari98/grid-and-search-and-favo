package com.example.mybestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val users3 = ArrayList<Example4> ()

        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              0","صفر              ","صفر              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                1","بير                ","واحد              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                2","إكي               ","اثنان              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"                3","إِوچ               ","ثلاثة              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              4","دورت              ","اربعة               "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              5","بَيش              ","خمسة              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"              6","ٱلت ِ             ","ستة              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"             7","يَدي              ","سبعة             "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            8","سَكيز             ","ثمانية             "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"            9","دوكوز             ","تسعة              "))
        users3.add(Example4(R.drawable.unlike,R.drawable.music,"               10","أَون               ","عشرة              "))





        recycler3.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val adapter1= ExampleAdapter3 (users3)
        recycler3.adapter= adapter1
    }
}
