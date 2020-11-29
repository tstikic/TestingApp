package com.example.tijana.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.setContentView(R.layout.activity_main)
        showHome()

        login_button.setOnClickListener {

            if (username.text.toString().isEmpty()) {
                text_input_layout.error = "You need to enter username"
                text_input_layout2.isErrorEnabled = false
            } else
                if (password.text.toString().isEmpty()) {
                    text_input_layout2.error = "You need to enter password"
                    text_input_layout.isErrorEnabled = false

                } else
                    if (username.text.toString() == "Admin" && password.text.toString() == "123456") {
                        val intent = Intent(this, SecondActivity::class.java)

                        startActivity(intent)
                    } else
                        if (username.text.toString() != "Admin"
                            || password.text.toString() != "123456"
                            && password.text.toString().isNotEmpty()
                            && username.text.toString().isNotEmpty()
                        ) {
                            text_input_layout.isErrorEnabled = false
                            text_input_layout.clearFocus()
                            username.text.clear()
                            password.text.clear()
                            text_input_layout2.clearFocus()
                            text_input_layout2.error = "Wrong password or username"
                        }
        }

    }


    private fun showHome() {
        home_layout.visibility = View.VISIBLE
        second_layout.visibility = View.GONE
    }

}
