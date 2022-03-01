package com.fandiaspraja.githubfundamentalandroid.core.utils

import android.content.Context
import android.util.Log
import androidx.core.provider.FontRequest
import androidx.emoji.bundled.BundledEmojiCompatConfig
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig

class EmojiUtils {

//    fun initEmojiCompat(context: Context, TAG: String, USE_BUNDLED_EMOJI: Boolean) {
//        val config: EmojiCompat.Config
//        config = if (USE_BUNDLED_EMOJI) {
//            // Use the bundled font for EmojiCompat
//            BundledEmojiCompatConfig(context)
//        } else {
//            // Use a downloadable font for EmojiCompat
//            val fontRequest: FontRequest = FontRequest(
//                "com.google.android.gms.fonts",
//                "com.google.android.gms",
//                "Noto Color Emoji Compat",
//                R.array.com_google_android_gms_fonts_certs
//            )
//            FontRequestEmojiCompatConfig(context, fontRequest)
//        }
//        config.setReplaceAll(true)
//            .registerInitCallback(object : EmojiCompat.InitCallback() {
//                override fun onInitialized() {
//                    Log.i(TAG, "EmojiCompat initialized")
//                }
//
//                override fun onFailed(throwable: Throwable?) {
//                    Log.e(TAG, "EmojiCompat initialization failed", throwable)
//                }
//            })
//        EmojiCompat.init(config)
//    }
}