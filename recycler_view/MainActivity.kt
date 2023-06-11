package com.example.recycler_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view.Item

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = generateItemList()
        adapter = RecyclerViewAdapter(itemList)
        recyclerView.adapter = adapter
    }

    private fun generateItemList(): List<Item> {
        val itemList = ArrayList<Item>()
        itemList.add(Item("Title 1", "Description 1"))
        itemList.add(Item("Title 2", "Description 2"))
        itemList.add(Item("Title 3", "Description 3"))
        return itemList
    }
}
