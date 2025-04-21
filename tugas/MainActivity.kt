package com.example.inputcontrols

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Alert Dialog
        val btnAlert = findViewById<Button>(R.id.btnAlert)
        btnAlert.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Peringatan")
                .setMessage("Kamu yakin ingin keluar?")
                .setPositiveButton("Ya") { _, _ ->
                    Toast.makeText(this, "Keluar ditekan", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Tidak", null)
                .create()

            alertDialog.show()
        }

        // Toast
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener {
            Toast.makeText(this, "Ini adalah Toast!", Toast.LENGTH_SHORT).show()
        }



    }
}
