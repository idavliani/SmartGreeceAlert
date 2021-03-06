package unipi.protal.smartgreecealert.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import androidx.preference.PreferenceManager;

import com.google.gson.Gson;

import java.util.List;
import java.util.Locale;

import unipi.protal.smartgreecealert.R;
import unipi.protal.smartgreecealert.entities.EmergencyContact;

public class SharedPrefsUtils {
public static final String LANGUAGE_KEY="locale_override";
public static final String LANGUAGE_DEFAULT="el";
public static final String EMERGENCY_CONTACTS="emergency_contacts";

    public static String getCurrentLanguage(Context ctx)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        String lang = prefs.getString(LANGUAGE_KEY, LANGUAGE_DEFAULT);
        return lang;
    }

    public static void updateLanguage(Context ctx, Resources res, String lang)
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = new Locale(lang);
        res.updateConfiguration(conf, dm);
        editor.putString(LANGUAGE_KEY, lang);
        editor.apply();
    }

    public static void setEmergencyContacts(Context ctx, List<EmergencyContact> emergencyContactList){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(emergencyContactList);
        editor.putString(EMERGENCY_CONTACTS, json);
        editor.apply();
    }

    public static String getEmergencyContacts(Context ctx){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        String json = prefs.getString(EMERGENCY_CONTACTS, null);
        return json;
    }

}
