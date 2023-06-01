package com.example.loan_eligibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="EMI calculator"
        var name=findViewById<EditText>(R.id.ED1)
        var cibil=findViewById<EditText>(R.id.ED2)
        var loan_amount=findViewById<EditText>(R.id.ED3)
        var button=findViewById<Button>(R.id.BT1)
        var tv1=findViewById<TextView>(R.id.TV1)
        var interest=10.0
        var years=5
        var permonth=interest/12/100
        var years_1=years*12
        button.setOnClickListener{
            var display=java.lang.StringBuilder()
            var get_cibil=cibil.getText().toString().toInt()
            var get_loan_amount=loan_amount.getText().toString().toInt()
            if(get_cibil>700){
                var emi=get_loan_amount*permonth*pow(1+permonth,years_1.toDouble())/(pow(1+permonth,years_1.toDouble())-1)
                display.append("${""+name.getText().toString()+" Elegible for loan amount "}"+get_loan_amount+" Your monthly emi is "+emi+" for 5 years so totally you have to pay the ammount of RS. "+years_1*emi)
                tv1.text=display
            }

            else{
                display.append("${""+name.getText().toString()+" Sorry, not enough cibil score to sanction loan"}")
                tv1.text=display
            }

        }
    }
}