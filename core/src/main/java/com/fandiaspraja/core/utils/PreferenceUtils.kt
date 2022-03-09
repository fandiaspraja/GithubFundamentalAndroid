package com.fandiaspraja.core.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences

import java.util.HashMap

class PreferenceUtils(val context: Context?) {


    val GITHUB_CONFIG = "zat_config"


    val sharedPref = context?.getSharedPreferences(GITHUB_CONFIG, Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor? = sharedPref?.edit()




    fun save(KEY_NAME: String, text: String) {

        editor?.putString(KEY_NAME, text)

        editor!!.commit()
    }

    fun save(KEY_NAME: String, value: Int) {

        editor?.putInt(KEY_NAME, value)

        editor?.commit()
    }

    fun save(KEY_NAME: String, status: Boolean) {

        editor?.putBoolean(KEY_NAME, status!!)

        editor?.commit()
    }

    fun getValueString(KEY_NAME: String): String? {

        return sharedPref?.getString(KEY_NAME, null)


    }

    fun getValueInt(KEY_NAME: String): Int {

        return sharedPref?.getInt(KEY_NAME, 0)!!
    }

    fun getValueBoolean(KEY_NAME: String, defaultValue: Boolean): Boolean {

        if (sharedPref != null) {
            return sharedPref.getBoolean(KEY_NAME, defaultValue)
        }

        return false
    }

    fun removeUser(){

    }


    fun clearSharedPreference() {

        editor?.clear()
        editor?.commit()
        editor?.apply()
    }

    fun removeValue(KEY_NAME: String) {

        val editor: SharedPreferences.Editor = sharedPref!!.edit()

        editor.remove(KEY_NAME)
        editor.commit()
    }

}