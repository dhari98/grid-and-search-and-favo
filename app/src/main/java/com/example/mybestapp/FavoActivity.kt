package com.example.mybestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favo)



/*
        val favorites = MainActivity.favoriteDatabase?.favoriteDao()?.favoriteData
        val rv = findViewById<RecyclerView>(R.id.rec)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)
        val adapter = FavoriteAdapter(favorites as List<Example4>)
        rv.adapter = adapter


 */

    }
}
