package dev.yudha.projectindividu

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val username = intent.getStringExtra("USERNAME")

        textViewWelcome.text = "Selamat Datang, $username!"
    }
}
