package com.example.mybestapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    private var imageViewLike: Button? =  null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)





        val users4 = ArrayList<Example4> ()

        /*
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"       mevsimleri","يِل مَوفسيملاري       ","فصول السنة         ",0))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"                Kış","كٓش                ","الشتاء               ",1))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             ilkBahar","إِلك بهار             ","الربيع              ",2))

         */
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"                Yaz","ياز                 ","الصيف              ",3))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"          SonBahar","سون بهار           ","الخريف             ",4))


        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Nisan","نيسان              ","أبريل              ",5))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Mayıs","مايس              ","مايو               ",6))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Haziran","هازيران            ","يونيو             ",7))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Temmuz","تَموز               ","يوليو              ",8))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Ağustos","ٱوستس            ","أغسطس            ",9))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Eylül","أيلول             ","سبتمبر           ",10))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"              Ekim","أكيم               ","أكتوبر             ",11))



        recyclerView4.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val adapter4= ExampleAdapter4 (users4)
        recyclerView4.adapter= adapter4

        //  imageViewLike = findViewById<View>(R.id.imageViewLike) as Button
        imageViewLike?.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity4,
                    FavoActivity::class.java
                )
            )



        }
    }
}