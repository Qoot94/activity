package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myItems = listOf<String>("Egg","Coat","Shirt")
        val myRecycle = findViewById<RecyclerView>(R.id.rvMain)
        myRecycle.adapter = RecycleViewAdapter(myItems)
        myRecycle.layoutManager = LinearLayoutManager(this)
    }
}