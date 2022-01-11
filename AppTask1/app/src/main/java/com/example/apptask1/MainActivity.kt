package com.example.apptask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameView = findViewById<EditText>(R.id.txtName)
        val ageView = findViewById<EditText>(R.id.txtAge)
        val branchView = findViewById<EditText>(R.id.txtBranch)

        btnSubmit.setOnClickListener {
            var name = nameView.text.toString()
            var age = ageView.text.toString()
            var branch = branchView.text.toString()

            val intent = Intent(this, InfoDisplayActivity::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Age", age)
            intent.putExtra("Branch", branch)
            startActivity(intent)
        }
    }
}