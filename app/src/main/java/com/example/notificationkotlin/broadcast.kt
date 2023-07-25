package com.example.notificationkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class broadcast:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val text=intent?.getStringExtra("pendingdata")
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}