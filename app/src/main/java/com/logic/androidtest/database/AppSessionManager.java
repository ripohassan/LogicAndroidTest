package com.logic.androidtest.database;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

public class AppSessionManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "PREF_OF_CAUSELIST";
    public static final String KEY_TOKEN = "token";

    public AppSessionManager(Context context) {
        this._context = context;
        sharedPreferences = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }


    public static String GetToken(final Context ctx) {
        return ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getString(KEY_TOKEN, "no token");//17
    }

    public static void setToken(final Context ctx, final String userToken) {
        final SharedPreferences prefs = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = prefs.edit();
        editor.putString(KEY_TOKEN, userToken);
        editor.commit();
    }


}
