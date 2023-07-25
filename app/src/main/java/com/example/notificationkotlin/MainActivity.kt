package com.example.notificationkotlin

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.core.app.NotificationCompat
import com.example.notificationkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
       var intent=Intent(this,MyIntentService::class.java)
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
       intent.putExtra("pendingdata",binding.content.text.toString())
       val pendingintent=PendingIntent.getService(this,0,intent,PendingIntent.FLAG_MUTABLE)


        binding.high.setOnClickListener {
            val notication=NotificationCompat.Builder(this,notication().channel_id)
//            notication.setChannelId(notication().channel_id)
            notication.setContentTitle(binding.title.text.toString())
            notication.setContentText(binding.content.text.toString())
            notication.setSmallIcon(R.drawable.ic_launcher_foreground)
            notication.setPriority(NotificationCompat.PRIORITY_HIGH).
             setColor(Color.MAGENTA).
            setCategory(NotificationCompat.CATEGORY_MESSAGE).
            addAction(R.drawable.intent,"play",pendingintent).
            addAction(R.drawable.intent,"play",null).
            addAction(R.drawable.intent,"play",null).
            setContentIntent(pendingintent).
            setOnlyAlertOnce(true).
            setAutoCancel(true)
            //setongoing for uncancel able notification

           notication.build()
            var manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            manager.notify(1,notication.build())





        }
        binding.low.setOnClickListener {
            val notication=NotificationCompat.Builder(this,notication().channel2_id)
            notication.setContentTitle(binding.title.text.toString())
            notication.setContentText(binding.content.text.toString())
            notication.setSmallIcon(R.drawable.ic_launcher_foreground)
//            (true).setColor(Color.MAGENTA).setAutoCancel(true).
//            addAction(R.drawable.ic_launcher_foreground,"play",null).addAction(R.drawable.ic_launcher_foreground,"play",null).
//            addAction(R.drawable.ic_launcher_foreground,"play",null)

               notication.setPriority(NotificationCompat.PRIORITY_DEFAULT).
            build()
            var manager=getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            manager.notify(1,notication.build())

        }


    }
}


