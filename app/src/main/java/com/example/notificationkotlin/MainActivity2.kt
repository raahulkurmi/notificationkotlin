package com.example.notificationkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notificationkotlin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private  val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val text=intent.getStringExtra("pendingdata")
        binding.textView.text = text
    }
}