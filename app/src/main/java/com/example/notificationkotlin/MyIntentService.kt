package com.example.notificationkotlin

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.util.Log

class MyIntentService : IntentService("MyIntentService") {

    override fun onHandleIntent(intent: Intent?) {
       if(intent!=null){
           Log.d("My Tag",intent.getStringExtra("pendingdata")!!)
       }
    }


    private fun handleActionFoo(param1: String?, param2: String?) {

    }


    private fun handleActionBaz(param1: String?, param2: String?) {
        TODO("Handle action Baz")
    }

    companion object {

    }
}