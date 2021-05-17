package com.example.tokoonline.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.tokoonline.MainActivity
import com.example.tokoonline.R
import com.example.tokoonline.helper.SharedPref

class MasukActivity : AppCompatActivity() {
    lateinit var s: SharedPref
    private lateinit var btn_login: Button
    private lateinit var btn_register: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
        s = SharedPref(this)
        mainButton()
    }

    private fun mainButton(){
        btn_login = findViewById(R.id.btn_prosesLogin)
        btn_login.setOnClickListener {
            s.setStatusLogin(true)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        btn_register = findViewById(R.id.btn_register)
        btn_register.setOnClickListener {
            //startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}