package com.tahil.timelyeatsformass

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
val submitButton = findViewById<Button>(R.id.buttonOne)
        val ResetButton2 = findViewById<Button>(R.id.button_Two)
        val editText = findViewById<EditText>(R.id.editTextOne)
        val editText2 = findViewById<EditText>(R.id.editTextTextMultiLine)

        submitButton.setOnClickListener {
            try {
                val inputText = editText.text.toString()
                //display breakfast options if Breakfast is typed
                if (inputText.toString() == "Breakfast") {
                    editText2.setText("cereal, greek yogurt, oatmeal")
                } else if (inputText.toString() == "Mid-Morning") {
                    editText2.setText("hard boiled eggs, peanut butter, fruit")
                    //display lunch options if lunch is typed
                } else if (inputText.toString() == "lunch") {
                    editText2.setText("chciken salad, lentil soup, chicken wraps")
                    //display Mid-day options if Mid-day is typed
                } else if (inputText.toString() == "Mid-day") {
                    editText2.setText("beef stew, fruit salad, yogurt")
                    //display dinner options if dinner is typed
                } else if (inputText.toString() == "dinner") {
                    editText2.setText("mutton curry, roasts, pastas")
                    //display dessert options if dessert is typed
                } else if (inputText.toString() =="desserts") {
                    editText2.setText("cake, fruit salads, malva pudding")
                    //Ai assisted code from chatgbt (editText.toString() ->inputText.toString())
                    // in tellysence

                } else {


                    Toast.makeText(this,"Please enter correct meal", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText( this , "Please enter correct meal", Toast.LENGTH_LONG).show()
            }
        }
      ResetButton2.setOnClickListener{
            editText.setText("")
            editText2.setText("")
            Toast.makeText(this, "All text has been reset", Toast.LENGTH_LONG).show()
           //when button is pressed all text will be cleared

        }

    }
        }