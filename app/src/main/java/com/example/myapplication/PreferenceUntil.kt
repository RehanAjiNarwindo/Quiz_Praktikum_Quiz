package com.example.myapplication

import android.content.Context
import androidx.preference.PreferenceManager

class PreferenceUtil private constructor(context: Context){

    companion object {

        private var instance: PreferenceUtil? = null

        fun newInstance(context: Context) = instance ?: PreferenceUtil(context).also {
            instance = it
        }

    }

    private  val  prefs = PreferenceManager.getDefaultSharedPreferences(context)

    fun setString (key: String, value : String) = prefs.edit().putString(key, value).apply()
    fun setBoolean (key: String, value : Boolean) = prefs.edit().putBoolean(key, value).apply()

    fun getString (key: String) = prefs.getString(key,null)
    fun getBoolean (key: String) = prefs.getBoolean(key, false)


}