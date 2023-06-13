package com.example.grid_view

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val imageIds = intArrayOf(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_foreground,
       R.drawable.ic_launcher_background
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView = findViewById<GridView>(R.id.gridView)
        gridView.adapter = ImageAdapter()
    }

    private inner class ImageAdapter : BaseAdapter() {
        override fun getCount(): Int {
            return imageIds.size
        }

        override fun getItem(position: Int): Any? {
            return null
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            val imageView: ImageView
            if (convertView == null) {
                val context: Context = parent.context
                imageView = ImageView(context)
                imageView.layoutParams = AbsListView.LayoutParams(200, 200)
                imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            } else {
                imageView = convertView as ImageView
            }
            imageView.setImageResource(imageIds[position])
            return imageView
        }

    }
}
