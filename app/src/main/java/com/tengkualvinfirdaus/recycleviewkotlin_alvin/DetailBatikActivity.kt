package com.tengkualvinfirdaus.recycleviewkotlin_alvin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBatikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_batik)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val batik = intent.getParcelableExtra<Batik>(MainActivity.INTENT_PARCELABLE)

        val imgBatik = findViewById<ImageView>(R.id.img_item_photo)
        val nameBatik = findViewById<TextView>(R.id.tv_item_name)
        val descBatik = findViewById<TextView>(R.id.tv_item_description)

        imgBatik.setImageResource(batik?.imgBatik!!)
        nameBatik.text = batik.nameBatik
        descBatik.text = batik.descBatik
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}