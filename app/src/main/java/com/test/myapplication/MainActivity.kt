package com.test.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.run {
            moveActivity2.setOnClickListener {
                startActivity(Intent(this@MainActivity,MainActivity2::class.java))
            }
        }
    }
}