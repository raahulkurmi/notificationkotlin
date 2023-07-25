package com.example.notificationkotlin

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Build.VERSION_CODES

class notication: Application() {
    public final val channel_id="priority_high"
    public final val channel2_id="priority_default"
    override fun onCreate() {
        super.onCreate()




        val channel=NotificationChannel(channel_id,"Channel1",NotificationManager.IMPORTANCE_HIGH)
        channel.description="the channel imnportance is high"
        val channel1=NotificationChannel(channel2_id,"Channel2",NotificationManager.IMPORTANCE_DEFAULT)
        channel1.description="the priority is default"

        val manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
        manager.createNotificationChannel(channel1)

    }
}