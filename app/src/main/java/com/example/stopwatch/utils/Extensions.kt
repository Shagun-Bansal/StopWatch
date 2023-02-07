package com.example.stopwatch.utils

import android.content.Context
import android.content.Intent
import java.text.SimpleDateFormat
import java.util.*

fun Long.getStopwatchTime(pattern: String = Constants.PATTERN): String {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    sdf.timeZone = TimeZone.getTimeZone(Constants.TIME_ZONE)
    return sdf.format(Date(this))
}

fun <T> Context.showAnotherActivity(activity: Class<T>) {
    val intent = Intent(this, activity)
    startActivity(intent)
}



