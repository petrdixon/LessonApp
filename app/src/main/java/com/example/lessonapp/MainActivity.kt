package com.example.lessonapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Class as Class1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataClass = DataClassExample(exampleInt = 1)
        val exampleString = dataClass.exampleString
        val exampleInt = dataClass.exampleInt

        var x:String

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(applicationContext, "$exampleString $exampleInt", Toast.LENGTH_SHORT)
                .show()
            button.text = "чего нибудь $exampleString$exampleInt"
        }

        val copyDataClass = DataClassExample().copy("testString2")
        button.text = "${copyDataClass.exampleString}"

    }
}

data class DataClassExample(val exampleString: String = "testString", val exampleInt: Int = 0)




