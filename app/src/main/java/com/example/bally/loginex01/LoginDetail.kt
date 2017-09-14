package com.example.bally.loginex01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_login_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginDetail : AppCompatActivity() {

    val myHashMap = hashMapOf<String, String>("username" to "x", "password" to "y")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_detail)

        val loginData = intent.extras
        var username: String = loginData.getString("username")
        var password: String = loginData.getString("password")
        Log.d("Data", "$username $password")
        if(myHashMap["username"] == username && myHashMap["password"] == password) {
//            usernameText1.setText(username)
            usernameText1.setText("$username")
            passwordText1.setText("$password")
        } else {
            this.finish()
        }
    }
}
