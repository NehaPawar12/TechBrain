package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnSupport = findViewById<Button>(R.id.support)

        btnSupport.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            val number = 8888523203
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }

        val btnAndroid = findViewById<CardView>(R.id.android)

        btnAndroid.setOnClickListener {
            val intent = Intent(applicationContext, Activity2_1::class.java)
            startActivity(intent)
        }

        val web = findViewById<CardView>(R.id.Webtxt)

        web.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://firebase.google.com/docs/database/android/read-and-write"))
            startActivity(intent)
        }

        val ui = findViewById<CardView>(R.id.UIUX)

        ui.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://roadmap.sh/full-stack"))
            startActivity(intent)
        }

        val ml = findViewById<CardView>(R.id.ML)

        ml.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://roadmap.sh/ai-data-scientist"))
            startActivity(intent)
        }

        val ai = findViewById<CardView>(R.id.AI)

        ai.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://medium.com/bitgrit-data-science-publication/a-roadmap-to-learn-ai-in-2024-cc30c6aa6e16"))
            startActivity(intent)
        }

        val block = findViewById<CardView>(R.id.Blockchain)
        block.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://roadmap.sh/blockchain"))
            startActivity(intent)
        }
    }
}