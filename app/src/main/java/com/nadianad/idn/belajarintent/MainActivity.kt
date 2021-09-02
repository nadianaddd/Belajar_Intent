package com.nadianad.idn.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        val btnIntentObject = findViewById<Button>(R.id.btn_move_object)

        val btnIntentData = findViewById<Button>(R.id.btn_intent_data)

        btnIntent.setOnClickListener(this)
        btnIntentObject.setOnClickListener(this)
        btnIntentData.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, IntentBiasaActivity::class.java)
                startActivity(intentBiasa)
            }

            R.id.btn_intent_data -> run {
                val intentData = Intent(this@MainActivity, IntentDenganData::class.java)
                intentData.putExtra(IntentDenganData.EXTRA_TEXT, "Hai, aku suka Dimsum")
                startActivity(intentData)
            }

            R.id.btn_move_object -> {
                val mobil = Mobil(
                    "Toyota Avanza",
                    2010,
                    "D 1630 NHP"
                )

                val intentObject = Intent(this@MainActivity, IntentObjectActivity::class.java)
                intent.putExtra(IntentObjectActivity.EXTRA_MOBIL, mobil)
                startActivity(intentObject)
            }
        }
    }
}