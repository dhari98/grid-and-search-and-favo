package com.example.mybestapp


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {




    private lateinit var photoAdapter: PhotoAdapter


    private var dataList = mutableListOf<DataModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = PhotoAdapter()
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("الحروف ", R.drawable.admin,0))
        dataList.add(DataModel("المفضلة ", R.drawable.admin,1))
        dataList.add(DataModel("فصول السنه ", R.drawable.admin,2))



        dataList.add(DataModel("فارغ ", R.drawable.admin,3))
        dataList.add(DataModel("فارغ ", R.drawable.admin,4))
        dataList.add(DataModel("فارغ ", R.drawable.admin,5))
        dataList.add(DataModel("فارغ ", R.drawable.admin,6))
        dataList.add(DataModel("فارغ ", R.drawable.admin,7))
        dataList.add(DataModel("فارغ ", R.drawable.admin,8))
        dataList.add(DataModel("فارغ ", R.drawable.admin,9))
        dataList.add(DataModel("فارغ ", R.drawable.admin,10))
        dataList.add(DataModel("فارغ ", R.drawable.admin,11))


        photoAdapter.setDataList(dataList)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        val item = menu?.findItem(R.id.search)
        val searchView: androidx.appcompat.widget.SearchView = item?.actionView as androidx.appcompat.widget.SearchView
        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String): Boolean {
                filter(newText)
                return false
            }
        })
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.search -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    private fun filter(text: String) {
        val filteredlist = ArrayList<DataModel>()

        for (item in dataList) {
            if (item.title.lowercase(Locale.getDefault())
                    .contains(text.lowercase(Locale.getDefault()))
            ) {
                filteredlist.add(item)
            }
        }
        if (filteredlist.isEmpty()) {
            Toast.makeText(baseContext, "غير متوفر هذا العنصر ..", Toast.LENGTH_SHORT).show()
        } else {
            photoAdapter.filterlist(filteredlist)
        }
    }
}