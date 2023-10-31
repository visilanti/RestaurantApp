package com.example.restaurantapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.store_detail)

        val extras = intent.extras
        val name = extras!!.getString("EXTRA_NAME")
        val store = extras!!.getString("EXTRA_STORE")
        val textView = findViewById<TextView>(R.id.header)
        val storeView = findViewById<TextView>(R.id.txt_store)
        val btnMenu = findViewById<Button>(R.id.btn_see_menus)

        textView.text = "Hello, " + name
        storeView.text = store

        btnMenu?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            val bundle = getIntent().extras
            if (bundle != null) {
                intent.putExtras(bundle)
            }
            startActivity(intent)
        })

//        val Intent = Intent(this@StoreDetailActivity, MenuActivity::class.java)

    }
}
