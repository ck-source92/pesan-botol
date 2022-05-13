package com.dwicandra.pesanbotol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dwicandra.pesanbotol.databinding.ActivityLoginBinding
import com.dwicandra.pesanbotol.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.tvSignup.setOnClickListener { signUpPage() }
        binding.btnLogin.setOnClickListener { homePage() }

    }
    private fun signUpPage() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun homePage(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}