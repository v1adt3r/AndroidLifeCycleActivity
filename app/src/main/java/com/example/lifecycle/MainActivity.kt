package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

const val NAME = "name"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("happy", "MainActivity onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("happy", "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("happy", "MainActivity onResume")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("happy", "MainActivity onRestart")
    }

    override fun onPause() {
        super.onPause()

        Log.d("happy", "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("happy", "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("happy", "MainActivity onDestroy")
    }

    fun startEdit(view: View) {
        val intent: Intent = Intent(this, EditActivity::class.java)

        intent.putExtra(NAME, "vladimir")

        //startActivity(intent)
        startActivityForResult(intent, 444)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(requestCode) {
            444 -> {
                val name: String? = data?.getStringExtra(NAME)
                Toast.makeText(this, "name: $name", Toast.LENGTH_SHORT).show()
            }
        }

         super.onActivityResult(requestCode, resultCode, data)
    }
}