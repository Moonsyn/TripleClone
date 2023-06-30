package com.liam.tripleclone

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.liam.tripleclone.databinding.ActivityLoginBinding


class LoginActivity : ComponentActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        init()
    }

    private fun init() {
        binding.tvLookAround.setOnClickListener {
            // 둘러보기 TODO
            startActivity(Intent(baseContext, MainActivity::class.java))
        }
        binding.btnNaver.setOnClickListener {
            // 네이버 로그인 TODO
        }

        binding.btnLogin.setOnClickListener {
            // 일반 로그인 TODO
        }
    }

}