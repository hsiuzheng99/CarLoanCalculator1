package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate_button.setOnClickListener()
        {
            val input: List<String> =
                listOf(car_price_edit.text.toString(), down_payment_amount_edit.text.toString(), loan_period_edit.text.toString(), interest_rate_edit.text.toString())

            val value:List<Double> = listOf(input.get(0).toDouble(), input.get(1).toDouble(), input.get(2).toDouble(), input.get(3).toDouble())

            val carLoan:Double = value.get(0) - value.get(1)
            val interest:Double = carLoan * value.get(3) * value.get(2)
            val monthlyRepayment:Double = (carLoan + interest)/ value.get(2) / 12

            txt_car_loan.text = "%.2f".format(carLoan)
            txt_interest.text= "%.2f".format(interest)
            txt_monthly_repayment.text = "%.2f".format(monthlyRepayment)

        }

    }
}
