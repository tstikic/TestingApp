package com.example.tijana.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*
import java.text.DateFormat
import java.util.*

class SecondActivity: AppCompatActivity() {

    val calendar = Calendar.getInstance().time

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setContentView(R.layout.second_activity)

        showSecondScreen()

        timeButton.setOnClickListener {

            when {
                plane.isChecked -> {
                    time.setText("70min")
                }
                car.isChecked -> {
                    time.setText("4h 10min")
                }
                foot.isChecked -> {
                    time.setText("3d 15h 25min")

                }
                else -> {
                    time.setText("Choose transportation")

                }
            }
        }

    }

    fun showSecondScreen(){
        second_layout.visibility = View.VISIBLE
        val currentDate = DateFormat.getDateInstance().format(calendar.time)
        date.text = currentDate
    }
}