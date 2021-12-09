package com.example.mybestapp


import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item4.view.*

class ExampleAdapter4(private val exampleList3: ArrayList<Example4>): RecyclerView.Adapter<ExampleAdapter4.ExampleViewHolder> () {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView3 =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item4, parent, false)
        return ExampleViewHolder(itemView3)
    }
    override  fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentItemExample3 = exampleList3[position]

        // currentItemExample3.imageViewWorld.let { holder.imageView1.setImageResource(it) }
        currentItemExample3.imageViewLike.let { holder.imageView2.setImageResource(it) }
        currentItemExample3.imageViewSound.let { holder.imageView3.setImageResource(it) }

        holder.textView1.text = currentItemExample3.text1
        holder.textView2.text = currentItemExample3.text2
        holder.textView3.text = currentItemExample3.text3

        holder.my_data4 = currentItemExample3






        holder.imageView2.setOnClickListener {


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

    class ExampleViewHolder(itemView3: View, var my_data4: Example4? = null) :
        RecyclerView.ViewHolder(itemView3) {
        //  val imageView1: ImageView = itemView.imageViewWorld


        val imageView2: ImageView = itemView.imageViewLike

        init {
            imageView2.setOnClickListener {
            }

        }

        val imageView3: ImageView = itemView.imageViewSound
        init {
            imageView3.setOnClickListener {



                //            if (position == 9) {
                //                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                //                    mediaPlayer?.start()
                //                }






                if (my_data4?.id == 3) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.sokak)
                    mediaPlayer?.start()
                }
                if (my_data4?.id == 4) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.sehir)
                    mediaPlayer?.start()
                }
                if (my_data4?.id == 5) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.okul)
                    mediaPlayer?.start()
                }
                if (my_data4?.id == 6) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (my_data4?.id == 7) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.turuncu)
                    mediaPlayer?.start()
                }
                if (my_data4?.id ==8) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.sehir)
                    mediaPlayer?.start()
                }
                if (my_data4?.id == 9) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.okul)
                    mediaPlayer?.start()
                }



            }
        }

        val textView1: TextView = itemView.textViewWorld
        val textView2: TextView = itemView.textViewWorld2
        val textView3: TextView = itemView.textViewWorld3
    }


}


