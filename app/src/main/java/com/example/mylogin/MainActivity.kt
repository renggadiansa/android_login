package com.example.mylogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mylogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var loginText: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getWindow().addFlags(windowManager.LayoutParams.FLAG_FULLSCREEN)
        //window.setFlags(windowManager.LayoutParams.FLAG_FULLSCREEN, windowManager.LayoutParams.FLAG_FULLSCREEN)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "user" && binding.password.text.toString() == "1234"){
                Toast.makeText(this, "Yeyyyyy, bisa LOGIN !!!!", Toast.LENGTH_SHORT).show()
                binding.button.setOnClickListener {
                    startActivity(Intent(this@MainActivity, wellcome::class.java))
                }
            }else {
                Toast.makeText(this, "Kasian tidak bisa LOGIN wkwkwk", Toast.LENGTH_SHORT).show()
            }
        })



    }

}



