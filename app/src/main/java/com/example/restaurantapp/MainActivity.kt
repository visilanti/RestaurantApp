package com.example.restaurantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKirim = findViewById<Button>(R.id.button_submit)
        val pilih_restoran = findViewById<Spinner>(R.id.pilih_restoran)
        val edit_nama = findViewById<EditText>(R.id.edit_nama)

        btnKirim?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, StoreDetailActivity::class.java)
            val name = edit_nama?.text.toString()
            val store = pilih_restoran?.getSelectedItem().toString()
            val extras = Bundle()
            extras.putString("EXTRA_NAME", name)
            extras.putString("EXTRA_STORE", store)
            intent.putExtras(extras)
            startActivity(intent)
        })

    }
}