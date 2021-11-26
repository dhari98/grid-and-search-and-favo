

package com.example.mybestapp


import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// class PhotoAdapter(var context: Context) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>(),Filterable {

class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var dataList = emptyList<DataModel>()

    internal fun setDataList(dataList: List<DataModel>) {
        this.dataList = dataList
    }

    class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView

        init {

            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_photo, parent, false)
        return ViewHolder(view)


    }


    @SuppressLint("NotifyDataSetChanged")
    fun filterlist(filterlist: ArrayList<DataModel>) {
        dataList = filterlist
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.title.text = data.title
        holder.image.setImageResource(data.image)
        holder.itemView.setOnClickListener {




            // اكواد الضغطة للتنقل بين الصفحات
            if (data.id == 0) {
                val my_intent = Intent(holder.itemView.context, MainActivity3::class.java)
                holder.itemView.context.startActivity(my_intent)
            }
            // اكواد الضغطة للتنقل بين الصفحات
            if (data.id == 1) {
                val my_intent = Intent(holder.itemView.context, FavoActivity::class.java)
                holder.itemView.context.startActivity(my_intent)
            }
            if (data.id == 2) {
                val my_intent = Intent(holder.itemView.context, MainActivity4::class.java)
                holder.itemView.context.startActivity(my_intent)
            }



        }
    }

    override fun getItemCount() = dataList.size
}


/*

package com.example.mybestapp


import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// class PhotoAdapter(var context: Context) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>(),Filterable {

class PhotoAdapter : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var dataList = emptyList<DataModel>()

    internal fun setDataList(dataList: List<DataModel>) {
        this.dataList = dataList
    }
    class ViewHolder(itemView: View, private var my_data: DataModel? = null) :
        RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView

        init {
            itemView.setOnClickListener {


                // اكواد الضغطة للتنقل بين الصفحات
                if (my_data?.id ==  0) {
                    val my_intent = Intent(itemView.context, MainActivity3::class.java)

                 //   my_intent.putExtra("name",my_data?.title)

                    itemView.context.startActivity(my_intent)

                }
                // اكواد الضغطة للتنقل بين الصفحات
                if (my_data?.id == 1) {
                    val my_intent = Intent(itemView.context, FavoActivity::class.java)
                    itemView.context.startActivity(my_intent)

                }
                if (my_data?.id == 2) {
                    val my_intent = Intent(itemView.context, MainActivity4::class.java)
                    itemView.context.startActivity(my_intent)

                }


            }
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
        }
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_photo, parent, false)
        return ViewHolder(view)




    }




    @SuppressLint("NotifyDataSetChanged")
    fun filterlist(filterlist:ArrayList<DataModel>){
        dataList=filterlist
        notifyDataSetChanged()
        }




    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]
        holder.title.text = data.title
        holder.image.setImageResource(data.image)
    }
    override fun getItemCount() = dataList.size
}




 */