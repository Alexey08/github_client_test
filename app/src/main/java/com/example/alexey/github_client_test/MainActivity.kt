package com.example.alexey.github_client_test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var numberList: RecyclerView? = null
    private var numbersAdapter: NumbersAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberList = findViewById(R.id.rv_numbers)

        val layoutManager = LinearLayoutManager(this)
        numberList!!.layoutManager = layoutManager

        numberList!!.setHasFixedSize(true)

        numbersAdapter = NumbersAdapter(10)
        numberList!!.adapter = numbersAdapter

    }
}
