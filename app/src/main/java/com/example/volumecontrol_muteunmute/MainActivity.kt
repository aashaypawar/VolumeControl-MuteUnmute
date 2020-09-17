package com.example.volumecontrol_muteunmute

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val muteBtn = findViewById<Button>(R.id.btnMute)
        val unmuteBtn = findViewById<Button>(R.id.btnUnmute)
        val audioManager = applicationContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager

        muteBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI)
        }

        unmuteBtn.setOnClickListener {
            audioManager.adjustVolume(AudioManager.ADJUST_UNMUTE, AudioManager.FLAG_SHOW_UI)
        }
    }
}