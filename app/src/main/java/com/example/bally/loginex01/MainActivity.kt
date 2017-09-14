package com.example.bally.loginex01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitButton.setOnClickListener {

            var intent = Intent(this, LoginDetail::class.java)
            intent.putExtra("username", usernameText.text.toString())
            intent.putExtra("password", passwordText.text.toString())
            startActivity(intent)
        }

        cancelButton.setOnClickListener {
            usernameText.setText("")
            passwordText.setText("")
        }
    }
}
