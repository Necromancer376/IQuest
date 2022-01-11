package com.example.apptask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_info_display.*
import kotlinx.android.synthetic.main.activity_main.*

class InfoDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_display)

        var intent = intent

        val name = intent.getStringExtra("Name")
        val age = intent.getStringExtra("Age")
        val branch = intent.getStringExtra("Branch")

        showName.text = "Name: $name"
        showAge.text = "Age: $age"
        showBranch.text = "Branch: $branch"
    }
}