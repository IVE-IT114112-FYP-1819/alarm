package com.example.issac.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import static android.content.Context.ALARM_SERVICE;
import static android.support.constraint.Constraints.TAG;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bData = intent.getExtras();
        if(bData.get("title").equals("activity_app"))
        {
            Intent alarm2cal = new Intent(context, CalActivity.class);
            context.startActivity(alarm2cal);
        }
    }




}
