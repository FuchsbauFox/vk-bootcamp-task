package com.vr.services

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vkLayout: LinearLayout = findViewById(R.id.vk_layout);
        vkLayout.setOnClickListener {
            openWebSite(Uri.parse("https://vk.com/"))
        }

        val myGamesLayout: LinearLayout = findViewById(R.id.my_games_layout);
        myGamesLayout.setOnClickListener {
            openWebSite(Uri.parse("https://my.games/"))
        }

        val sferumLayout: LinearLayout = findViewById(R.id.sferum_layout);
        sferumLayout.setOnClickListener {
            openWebSite(Uri.parse("https://sferum.ru/?p=start"))
        }

        val youlaLayout: LinearLayout = findViewById(R.id.youla_layout);
        youlaLayout.setOnClickListener {
            openWebSite(Uri.parse("https://youla.ru/"))
        }

        val samokatLayout: LinearLayout = findViewById(R.id.samokat_layout);
        samokatLayout.setOnClickListener {
            openWebSite(Uri.parse("https://samokat.ru/"))
        }

        val cityDriveLayout: LinearLayout = findViewById(R.id.city_drive_layout);
        cityDriveLayout.setOnClickListener {
            openWebSite(Uri.parse("https://citydrive.ru/"))
        }

        val cloudLayout: LinearLayout = findViewById(R.id.cloud_layout);
        cloudLayout.setOnClickListener {
            openWebSite(Uri.parse("https://cloud.mail.ru/home/"))
        }

        val aptekiLayout: LinearLayout = findViewById(R.id.apteki_layout);
        aptekiLayout.setOnClickListener {
            openWebSite(Uri.parse("https://vseapteki.ru/"))
        }

        val calendarLayout: LinearLayout = findViewById(R.id.calendar_layout);
        calendarLayout.setOnClickListener {
            openWebSite(Uri.parse("https://calendar.mail.ru/"))
        }
    }

    private fun openWebSite(uri: Uri) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.data = uri
        startActivity(intent)
    }
}