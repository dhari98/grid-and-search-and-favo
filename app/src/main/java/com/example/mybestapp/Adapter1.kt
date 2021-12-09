package com.example.mybestapp


import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item4.view.*

class ExampleAdapter3(private val exampleList3: ArrayList<Example4>) :
    RecyclerView.Adapter<ExampleAdapter3.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView3 =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item4, parent, false)
        return ExampleViewHolder(itemView3 )




      //  val position : Int? = null
    }



    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {



        val currentItemExample3 = exampleList3[position]

     
        currentItemExample3.imageViewLike.let { holder.imageView2.setImageResource(it) }
        currentItemExample3.imageViewSound.let { holder.imageView3.setImageResource(it) }

        holder.textView1.text = currentItemExample3.text1
        holder.textView2.text = currentItemExample3.text2
        holder.textView3.text = currentItemExample3.text3
        holder.my_data3 = currentItemExample3



        holder.imageView2.setOnClickListener { view ->



       //     Toast.makeText(MainActivity3.this, "Clicked", Toast. LENGTH_SHORT).show()

            val dataBaseDao = FavoriteDatabase.getInstance(holder.itemView.context)?.favoriteDao()

            val item = dataBaseDao?.getItem(exampleList3[position].id)
            if (item == null) {
                dataBaseDao?.addData(exampleList3[position].copy(isFavorite = true))
                holder.imageView2.setImageResource(R.drawable.like)
            } else {
                dataBaseDao.delete(item.copy(isFavorite = !item.isFavorite))
                holder.imageView2.setImageResource(R.drawable.unlike)
            }



        }




        }

    override fun getItemCount() = exampleList3.size

    class ExampleViewHolder(itemView3: View, var my_data3: Example4? = null) :

    //  class ExampleViewHolder(itemView3: View, private var position: Int?, var my_data3: Example4? = null) :
        RecyclerView.ViewHolder(itemView3) {



        //  val imageView1: ImageView = itemView.imageViewWorld


        val imageView2: ImageView = itemView.imageViewLike

        val imageView3: ImageView = itemView.imageViewSound




        init {


        //    itemId

            imageView3.setOnClickListener {



                if (my_data3?.id == 0) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (my_data3?.id == 1) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.yesil)
                    mediaPlayer?.start()
                }
                if (my_data3?.id == 2) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.turuncu)
                    mediaPlayer?.start()
                }
}




        }

        val textView1: TextView = itemView.textViewWorld
        val textView2: TextView = itemView.textViewWorld2
        val textView3: TextView = itemView.textViewWorld3
    }


}



/*



        if (MainActivity3.favoriteDatabase!!.favoriteDao()!!
                .isFavorite(exampleList3)
        )
            holder.imageView2.setImageResource(R.drawable.like) else holder.imageView2.setImageResource(
            R.drawable.unlike
        )


        holder.imageView2.setOnClickListener {
            val dataBaseDao = FavoriteDatabase.getInstance(holder.itemView.context)?.favoriteDao()
            val item = dataBaseDao?.getItem(exampleList3[position].id)
            if (item == null) {
                dataBaseDao?.addData(exampleList3[position].copy(isFavorite = true))
                holder.imageView2.setImageResource(R.drawable.like)
            } else {
                dataBaseDao.addData(item.copy(isFavorite = !item.isFavorite))
                holder.imageView2.setImageResource(R.drawable.unlike)
            }
        }
    }















            if (MainActivity.FavoriteDatabase!!.favoriteDao()!!
                    .isFavorite(example_item4.id) == 1
            )
                holder.favorite.setImageResource(R.drawable.like) else holder.favorite.setImageResource(
                R.drawable.unlike
            )
            holder.favorite.setOnClickListener {
                val favoriteEntity = Example4()

                val id = .id
                val textView1 = example_item4.textView1
                val textView2 = example_item4.textView2
                val textView3 = example_item4.textView3


                if (MainActivity.favoriteDatabase!!.favoriteDao()!!.isFavorite(id) != 1) {
                    holder.favorite.setImageResource(R.drawable.like)
                    MainActivity.favoriteDatabase!!.favoriteDao()!!.addData(Example4)
                } else {
                    holder.favorite.setImageResource(R.drawable.unlike)
                    MainActivity.favoriteDatabase!!.favoriteDao()!!.delete(Example4)
                }


            }


 */