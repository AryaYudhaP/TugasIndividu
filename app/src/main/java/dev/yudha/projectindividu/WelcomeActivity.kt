package dev.yudha.projectindividu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonLogout = findViewById<Button>(R.id.button)

        // Fungsi tombol Logout untuk kembali ke halaman Login
        buttonLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup WelcomeActivity agar tidak bisa kembali dengan tombol back
        }
    }
}

