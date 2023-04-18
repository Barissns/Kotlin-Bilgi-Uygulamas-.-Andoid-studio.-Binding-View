package com.example.bilgilerimigoster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bilgilerimigoster.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.BtnGoster.setOnClickListener{
            binding.gostertext.text =binding.adSoyad.text
            binding.adSoyad.text.clear()
        }



    }
}