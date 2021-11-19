package com.example.mybestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)





        val users4 = ArrayList<Example4> ()

        users4.add(Example4(R.drawable.unlike,R.drawable.music,"       mevsimleri","يِل مَوفسيملاري       ","فصول السنة         "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"                Kış","كٓش                ","الشتاء               "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             ilkBahar","إِلك بهار             ","الربيع              "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"                Yaz","ياز                 ","الصيف              "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"          SonBahar","سون بهار           ","الخريف             "))


        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Nisan","نيسان              ","أبريل              "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Mayıs","مايس              ","مايو               "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Haziran","هازيران            ","يونيو             "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Temmuz","تَموز               ","يوليو              "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"           Ağustos","ٱوستس            ","أغسطس            "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Eylül","أيلول             ","سبتمبر           "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"              Ekim","أكيم               ","أكتوبر             "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Kasım","كاسٓم              ","نوفمبر             "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Aralık","ارالٓك              ","ديسمبر            "))


        users4.add(Example4(R.drawable.unlike,R.drawable.music,"            ayları","يِل ايلاري            ","أشهر السنة          "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"              Ocak","أَوجاك              ","يناير              "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"             Şubat","شوبات             ","فبراير             "))
        users4.add(Example4(R.drawable.unlike,R.drawable.music,"              Mart","مارت               ","مارس              "))



        recyclerView4.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val adapter4= ExampleAdapter4 (users4)
        recyclerView4.adapter= adapter4
    }
}
