package com.example.alexey.github_client_test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ChildActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)

        textView = findViewById(R.id.tv_child)
    }
}
