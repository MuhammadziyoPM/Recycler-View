package com.example.chat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chat.R
import com.example.chat.adapter.UserAdapter
import com.example.chat.model.User

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(this)

        refreshAdapter(data())

    }

    private fun refreshAdapter(user:ArrayList<User>) {
        val adapter = UserAdapter(user)
        recyclerView.adapter = adapter
    }

    fun data():ArrayList<User>{
        val list = ArrayList<User>()


            list.add(User(R.drawable.img,"Sayohat dgdsgss ","sgssd"))

        list.add(User(R.drawable.img,"Sayohat qiling ","Yevropaga"))
        list.add(User(R.drawable.img,"Ssdfgsgsdfgg ","sgsgsg"))
        list.add(User(R.drawable.img,"Sayohat dgdsgss ","sgssd"))

        list.add(User(R.drawable.img,"Sayohat qiling ","Yevropaga"))
        list.add(User(R.drawable.img,"Ssdfgsgsdfgg ","sgsgsg"))
        list.add(User(R.drawable.img,"Sayohat dgdsgss ","sgssd"))


        return list
    }
}