package com.example.mybestapp


import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item4.view.*

class ExampleAdapter3(private val exampleList3: ArrayList<Example4>): RecyclerView.Adapter<ExampleAdapter3.ExampleViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView3 =
            LayoutInflater.from(parent.context).inflate(R.layout.example_item4, parent, false)
        return ExampleViewHolder(itemView3)
    }
    override  fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentItemExample3 = exampleList3[position]

        currentItemExample3.imageViewLike.let { holder.imageView2.setImageResource(it) }
        currentItemExample3.imageViewSound.let { holder.imageView3.setImageResource(it) }

        holder.textView1.text = currentItemExample3.text1
        holder.textView2.text = currentItemExample3.text2
        holder.textView3.text = currentItemExample3.text3




        holder.my_data3 = currentItemExample3
    }




    override fun getItemCount() = exampleList3.size

    class ExampleViewHolder(itemView3: View, var my_data3: Example4? = null) :
        RecyclerView.ViewHolder(itemView3) {
        //  val imageView1: ImageView = itemView.imageViewWorld


        val imageView2: ImageView = itemView.imageViewLike

        val imageView3: ImageView = itemView.imageViewSound
        init {
            imageView3.setOnClickListener {
                if (position == 0) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 1) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 2) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 3) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 4) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 5) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 6) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
                }
                if (position == 7) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                    mediaPlayer?.start()
            }
            if (position == 8) {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                mediaPlayer?.start()
            }
            if (position == 9) {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
                mediaPlayer?.start()
            }
                if (position == 10) {
                    val mediaPlayer: MediaPlayer? = MediaPlayer.create(it.context, R.raw.abdwap)
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