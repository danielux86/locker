package com.daniele.locker

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_passwords.*

class Passwords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passwords)

        passwordsText.text = """
            Bancomat: 12345
            Facebook: ciripicchio1
            Instagram: percincetorice
        """.trimIndent()
    }

    companion object {
        fun sendIntent (context: Context) {
            context.startActivity(Intent(context, Passwords::class.java))
        }
    }
}