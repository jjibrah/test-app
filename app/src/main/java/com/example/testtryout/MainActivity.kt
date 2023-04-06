package com.example.testtryout

import android.content.Intent
import android.icu.util.IslamicCalendar.CalculationType
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var mCalc:Button
    lateinit var mWeb:Button
    lateinit var mList:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mCalc=findViewById(R.id.mBtnCalc)
        mWeb=findViewById(R.id.mBtnWeb)
        mList=findViewById(R.id.mBtnContact)
        //set on click listeners
        mCalc.setOnClickListener {
            var enda = Intent(this@MainActivity,calculatorActivity::class.java)
            startActivity(enda)

        }
        mWeb.setOnClickListener {
            var tembea = Intent(this@MainActivity, websiteActivity::class.java)
            startActivity(tembea)
        }


        mList.setOnClickListener {
            var go = Intent(this@MainActivity,contactActivity::class.java)
            startActivity(go)

        }
    }
}