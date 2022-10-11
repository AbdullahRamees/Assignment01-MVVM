package com.atarious.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atarious.myapplication.ui.main.MainFragment
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}