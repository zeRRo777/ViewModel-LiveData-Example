package com.example.livedatademo

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        val button = findViewById<Button>(R.id.btnCount)
        val reset = findViewById<Button>(R.id.btnReset)
        val textCount = findViewById<TextView>(R.id.tvCount)



        viewModel.count.observe(this, Observer {
            textCount.text = it.toString()
        })

        button.setOnClickListener {

            viewModel.updateCount()
        }

        reset.setOnClickListener {
            viewModel.resetCount()
        }
    }

}