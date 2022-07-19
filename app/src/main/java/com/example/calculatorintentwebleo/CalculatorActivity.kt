package com.example.calculatorintentwebleo

//import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var buttonAddition :Button
    lateinit var buttonSubtract : Button
    lateinit var buttonMultiplication : Button
    lateinit var buttonDivsion :Button
    lateinit var edt_fnum :EditText
    lateinit var edt_snum :EditText
    lateinit var text_answer :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        buttonAddition=findViewById(R.id.btn_add)
        buttonSubtract=findViewById(R.id.btn_subtract)
        buttonDivsion=findViewById(R.id.btn_division)
        buttonMultiplication=findViewById(R.id.btn_multiplication)
        edt_fnum=findViewById(R.id.edt_fnum)
        edt_snum=findViewById(R.id.edt_snum)
        text_answer=findViewById(R.id.text_answer)

        buttonAddition!!.setOnClickListener {
            var firstnum=edt_fnum.text.toString()
            var snum=edt_snum.text.toString()
            if (firstnum.isEmpty() && snum.isEmpty()){
                var also = "Please fill in all inputs".also { text_answer.text = it }
            }else{
                var Answer=firstnum.toDouble() + snum.toDouble()
                text_answer.text=Answer.toString()
            }

        }

        buttonSubtract!!.setOnClickListener {
            var firstnum=edt_fnum.text.toString()
            var snum=edt_snum.text.toString()
            if(firstnum.isEmpty() && snum.isEmpty()){
                text_answer.text="Please fill in all fields"
            }else{
                var Answer=firstnum.toDouble() - snum.toDouble()
                text_answer.text=Answer.toString()

            }
        }

        buttonDivsion!!.setOnClickListener{
            var firstnum=edt_fnum.text.toString()
            var snum=edt_snum.text.toString()
            if(firstnum.isEmpty() && snum.isEmpty()){
                text_answer.text="Please fill in all fields"
        }else{
                var Answer=firstnum.toDouble() / snum.toDouble()
                text_answer.text=Answer.toString()

            }

        buttonMultiplication!!.setOnClickListener {
            firstnum=edt_fnum.text.toString()
            var snum=edt_snum.text.toString()
            if(firstnum.isEmpty() && snum.isEmpty()){
                text_answer.text="Please fill in all fields"
        }else{
                var Answer=firstnum.toDouble() * snum.toDouble()
                text_answer.text=Answer.toString()

            }

        }

    }
}
}