package com.fandiaspraja.githubfundamentalandroid.ui.setting

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.fandiaspraja.githubapp.ui.setting.DatePickerFragment
import com.fandiaspraja.githubapp.ui.setting.TimePickerFragment
import com.fandiaspraja.githubfundamentalandroid.R
import com.fandiaspraja.core.utils.PreferenceUtils
import kotlinx.android.synthetic.main.activity_setting.*
import java.text.SimpleDateFormat
import java.util.*

class SettingActivity : AppCompatActivity(), View.OnClickListener, DatePickerFragment.DialogDateListener, TimePickerFragment.DialogTimeListener {

    private lateinit var alarmReceiver: com.fandiaspraja.core.broadcast.AlarmReceiver

    companion object {
        private const val DATE_PICKER_TAG = "DatePicker"
        private const val TIME_PICKER_ONCE_TAG = "TimePickerOnce"
        private const val TIME_PICKER_REPEAT_TAG = "TimePickerRepeat"
    }

    lateinit var preferenceUtils: PreferenceUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        preferenceUtils = PreferenceUtils(this)

        alarmReceiver = com.fandiaspraja.core.broadcast.AlarmReceiver()

        switch_alarm.setOnClickListener {
            if (switch_alarm.isChecked){
                Toast.makeText(this, "Turn On Alarm", Toast.LENGTH_SHORT).show()
                alarmReceiver.setRepeatingAlarm(this, com.fandiaspraja.core.broadcast.AlarmReceiver.TYPE_REPEATING,
                    "09:00", "Let's find user popular user on Github!")

                preferenceUtils.save("gitnotif", true)
            }else{
                alarmReceiver.deleteRepeatingAlarm(this)
                Toast.makeText(this, "Turn Of ALarm", Toast.LENGTH_SHORT).show()
                preferenceUtils.save("gitnotif", false)

            }
        }

        if (preferenceUtils.getValueBoolean("gitnotif", false) != null){
            if (preferenceUtils.getValueBoolean("gitnotif", false)){
                switch_alarm.isChecked = true
            }else{
                switch_alarm.isChecked = false
            }
        }

        switch_theme.setOnClickListener {
            val isNightTheme = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK

            when (isNightTheme) {
                Configuration.UI_MODE_NIGHT_YES -> {
                    Toast.makeText(this, "Disable Night Mode", Toast.LENGTH_SHORT).show()
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                    preferenceUtils.save("theme", false)
                }

                Configuration.UI_MODE_NIGHT_NO ->{
                    Toast.makeText(this, "Enable Night Mode", Toast.LENGTH_SHORT).show()
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                    preferenceUtils.save("theme", true)
                }
            }
        }

        if (preferenceUtils.getValueBoolean("theme", false) != null){
            if (preferenceUtils.getValueBoolean("theme", false)){
                switch_theme.isChecked = true
            }else{
                switch_theme.isChecked = false
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
        }
    }

    override fun onDialogDateSet(tag: String?, year: Int, month: Int, dayOfMonth: Int) {
        // Siapkan date formatter-nya terlebih dahulu
        val calendar = Calendar.getInstance()
        calendar.set(year, month, dayOfMonth)
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

        // Set text dari textview once
//        tvOnceDate?.text = dateFormat.format(calendar.time)
    }

    override fun onDialogTimeSet(tag: String?, hourOfDay: Int, minute: Int) {
        // Siapkan time formatter-nya terlebih dahulu
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
        calendar.set(Calendar.MINUTE, minute)

        val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())

        // Set text dari textview berdasarkan tag
        when (tag) {
//            TIME_PICKER_ONCE_TAG -> binding?.tvOnceTime?.text = dateFormat.format(calendar.time)
//            TIME_PICKER_REPEAT_TAG -> tv_repeating_time.text = dateFormat.format(calendar.time)
            else -> {
            }
        }
    }
}