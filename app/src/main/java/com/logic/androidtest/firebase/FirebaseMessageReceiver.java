package com.logic.androidtest.firebase;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.logic.androidtest.MainActivity;
import com.logic.androidtest.R;


@SuppressLint("MissingFirebaseInstanceTokenRefresh")
public class FirebaseMessageReceiver extends FirebaseMessagingService {
    @Override
    public void
    onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            showNotification(
                    remoteMessage.getNotification().getTitle(),
                    remoteMessage.getNotification().getTag(),
                    remoteMessage.getNotification().getBody());

        }
    }

    private RemoteViews getCustomDesign(String title,String body) {
        @SuppressLint("RemoteViewLayout") RemoteViews remoteViews = new RemoteViews(
                getApplicationContext().getPackageName(),
                R.layout.notification);
        remoteViews.setTextViewText(R.id.title, title);
        remoteViews.setTextViewText(R.id.message, body);
        remoteViews.setImageViewResource(R.id.icon, R.drawable.ic_logo);
        return remoteViews;
    }
    public void showNotification(String title, String date,
                                 String body) {
        String channel_id = "notification_channel";
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("id",""+date);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder
                = new NotificationCompat
                .Builder(getApplicationContext(),
                channel_id)
                .setSmallIcon(R.drawable.ic_logo)
                .setAutoCancel(true)
                .setVibrate(new long[]{1000, 1000, 1000,
                        1000, 1000})
                .setOnlyAlertOnce(true)
                .setContentIntent(pendingIntent);

        builder = builder.setContent(getCustomDesign(title,body));

        NotificationManager notificationManager
                = (NotificationManager) getSystemService(
                Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT
                >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel
                    = new NotificationChannel(
                    channel_id, getString(R.string.app_name),
                    NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(
                    notificationChannel);
        }

        notificationManager.notify(0, builder.build());
    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.d("newToken", s);
    }
}
