package com.binar.myproject.adapterrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //membuat arrayList of Myfruit sebagai daftar file

        val listBuah = arrayListOf(
            MyFruit("Strawberry", R.drawable.ic_strawberry),
            MyFruit("Pineapple", R.drawable.ic_pineapple),
            MyFruit("Apple", R.drawable.ic_apple),
            MyFruit("Lemon", R.drawable.ic_lemon),
            MyFruit("Orange", R.drawable.ic_orange)
        )

// Membuat adapter

            val adapter = FruitAdapter(listBuah)

        // Menyiapkan Layout Manager

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //Set LayoutManager pada recyclerview
        recyclerView.layoutManager = layoutManager

        //set adapter pada recyclerView

        recyclerView.adapter = adapter
    }

}