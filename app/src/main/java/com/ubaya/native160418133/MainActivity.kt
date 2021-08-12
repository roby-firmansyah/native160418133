package com.ubaya.native160418133

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var name:String = "Roby"
    private var phone:String = "081330"
    private var nama:String = "Iyan"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome to Android $name", Toast.LENGTH_SHORT).show()
    }
}