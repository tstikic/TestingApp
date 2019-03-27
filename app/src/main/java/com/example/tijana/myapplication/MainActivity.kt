package com.example.tijana.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*
import org.jetbrains.anko.toast
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    val calendar = Calendar.getInstance().time


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showHome()

        login_button.setOnClickListener(){

            if(username.text.toString() == "Admin" && password.text.toString() == "123456"){
                showSeconScreen()
            }
            else
            {
                username.text.clear()
                password.text.clear()
                toast("Wrong Username or Password")
            }
        }

    }


    private fun showHome(){

        home_layout.visibility = View.VISIBLE
        second_layout.visibility = View.GONE

    }

    private fun showSeconScreen(){
        home_layout.visibility = View.GONE
        second_layout.visibility = View.VISIBLE
        val currentDate = DateFormat.getDateInstance().format(calendar.time)
        date.text = currentDate

    }
}
