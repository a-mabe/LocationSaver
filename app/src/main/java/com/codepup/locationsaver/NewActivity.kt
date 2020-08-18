package com.codepup.locationsaver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        /* Add this line to get the back button on the Actionbar*/
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}