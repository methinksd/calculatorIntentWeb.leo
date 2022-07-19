package com.example.calculatorintentwebleo

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var buttonCalculator:Button ?= null
    var buttonIntent:Button ?= null
    var buttonWeb:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       buttonCalculator=findViewById(R.id.btn_calc)

        buttonCalculator!!.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        buttonIntent=findViewById(R.id.Btn_Intent)

         buttonIntent!!.setOnClickListener {
             val intent1 = Intent(this, IntentActivity::class.java)
             startActivity(intent1)
         }

        buttonWeb=findViewById(R.id.Btn_web)
        buttonWeb!!.setOnClickListener {
                 val intent2=Intent(this,WebActivity2::class.java)
                 startActivity(intent2)
             }
         }
        }

