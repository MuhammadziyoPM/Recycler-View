package com.example.chat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chat.R
import com.example.chat.model.User
import com.google.android.material.imageview.ShapeableImageView

class UserAdapter(var list:ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val user:User = list[position]
        if (holder is UserViewHolder){
            holder.pro_img.setImageResource(user.image)
            holder.fulname.text = user.fullname
            holder.title.text = user.title
        }

    }

    inner class UserViewHolder(view: View):RecyclerView.ViewHolder(view){
        val pro_img:ShapeableImageView = view.findViewById(R.id.pro_id)
        val fulname:TextView = view.findViewById(R.id.fullname)
        val title:TextView = view.findViewById(R.id.title)
    }

}