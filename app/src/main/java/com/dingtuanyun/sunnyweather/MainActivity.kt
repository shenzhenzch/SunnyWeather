package com.dingtuanyun.sunnyweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dingtuanyun.sunnyweather.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.webViewBtn.setOnClickListener {

         }

         binding.networkBtn.setOnClickListener {

         }

         binding.getAppDataBtn.setOnClickListener {


         }



    }




}