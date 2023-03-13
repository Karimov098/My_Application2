package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv: RecyclerView = findViewById(R.id.my_recyclerview)
        rv.adapter = Adapter(getList())

    }
    fun getList() {
        val list = ArrayList<MyClass>()
        (0..50).forEach { name ->
            list.add(MyClass("","Name $name", "Surname $name"))
        }
    }
}