package com.example.foodorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.foodorderapp.databinding.ActivityMainBinding

// === Manual ===
/*
class MainActivity : AppCompatActivity() {

    private var ivProfile: ImageView? = null

    // by lazy = hanya diinisialisasi saat ia dipanggil
    private val tvName : TextView by lazy {
        findViewById(R.id.tv_greeting)
    }

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        setAction()
        changeProfileContent()
    }

    private fun bind() {
        ivProfile = findViewById(R.id.iv_profile_menu)
    }

    private fun setAction(){
        ivProfile?.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is toast text", Toast.LENGTH_LONG).show()
        }
    }

    private fun changeProfileContent() {
        ivProfile?.setImageResource(R.drawable.ic_launcher_background)
    }
}
 */

// use activity binding
class MainActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setAction()
        changeProfileContent()
    }

    private fun setAction(){
        binding.layoutHeader.ivProfileMenu.setOnClickListener {
            Toast.makeText(this@MainActivity, "This is toast text", Toast.LENGTH_LONG).show()
        }
    }

    private fun changeProfileContent() {
        binding.layoutHeader.ivProfileMenu.setImageResource(R.drawable.ic_launcher_background)
    }
}