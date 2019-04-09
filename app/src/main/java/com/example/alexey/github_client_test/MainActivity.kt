package com.example.alexey.github_client_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val articleTitle = MutableList(4, {x -> "Item$x"})
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, articleTitle)
        listView.adapter = adapter
    }
}