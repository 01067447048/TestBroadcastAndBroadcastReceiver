package com.example.broadcastsreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by Jaehyeon on 2023/07/03.
 */
class TestActionReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == "TEST_ACTION") {
            println("Received test intent!")
        }
    }

}