package com.example.listview
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.lv)
        val items = arrayListOf("Samsung", "Apple","vivo","poco")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, position, l -> // TODO Auto-generated method stub
                var value = adapter.getItem(position)
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("J007", value.toString())
                startActivity(intent)
            }
        }
}