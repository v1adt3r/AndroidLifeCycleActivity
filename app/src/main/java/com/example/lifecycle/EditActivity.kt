package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class EditActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edit: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        edit   = findViewById(R.id.edit)
        button = findViewById(R.id.button)

        Log.d("happy", "EditActivity onCreate")

        val intent: Intent = intent

        val name: String? = intent.getStringExtra("name")

        edit.setText(name)

        button.setOnClickListener(this)
    }

    override fun onStart() {
        super.onStart()

        Log.d("happy", "EditActivity onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("happy", "EditActivity onResume")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("happy", "EditActivity onRestart")
    }

    override fun onPause() {
        super.onPause()

        Log.d("happy", "EditActivity onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("happy", "EditActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("happy", "EditActivity onDestroy")
    }

    override fun onClick(p0: View?) {
        val name: String   = edit.text.toString()
        val intent: Intent = Intent()
        intent.putExtra(NAME, name)

        setResult(RESULT_OK, intent)
        onBackPressed()
    }
}