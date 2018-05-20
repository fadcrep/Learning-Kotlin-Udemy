package com.fadservices.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_green.*

class GreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val myIntent=intent
        val user=myIntent.getParcelableExtra<User>("user")

        val nameTextView=name
        val ageTextView=age

        nameTextView.text="Nom: ${user.name}"
        ageTextView.text= "Age: ${user.age}"

    }
}
