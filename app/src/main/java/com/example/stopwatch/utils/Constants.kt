package com.example.stopwatch.utils

import androidx.lifecycle.MutableLiveData

object Constants {
    const val CHANNEL_ID = "timer_notify"
    const val BROADCAST_NAME = "timer_broadcast"
    const val NOTIFICATION_NAME = "Timer Notification"
    const val NOTIFICATION_DESC = "This channel is used to display the current timer"
    const val SHARED_PREF = "TimerSharedPref"
    const val PATTERN = "mm:ss.SS"
    const val PATTERN_MIN_SEC = "mm:ss"
    const val TIME_ZONE = "GMT"
    val SECONDS: MutableLiveData<Long> = MutableLiveData(0)
}