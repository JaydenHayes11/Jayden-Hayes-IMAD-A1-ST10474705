package za.co.varsitycollege.imad_a1_st10474705

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val ResetPageButton = findViewById<Button>(R.id.ResetPageButton)
        val ShowSuggestionsButton = findViewById<Button>(R.id.ShowSuggestionsButton)
        val TimeOfDayText = findViewById<TextView>(R.id.TimeOfDayText)
        val DisplayTextView = findViewById<TextView>(R.id.DisplayTextView)

        ShowSuggestionsButton?.setOnClickListener {

            DisplayTextView.text = ""

            Toast.makeText(
                this@MainActivity,
                "Suggestions Shown", Toast.LENGTH_LONG
            ).show()


        }




        ResetPageButton?.setOnClickListener {

            TimeOfDayText.text = ""
            DisplayTextView.text = "Options for time of Day:Morning,Mid-Morning,Afternoon,Mid-Afternoon,Dinner,After-Dinner"

            Toast.makeText(
                this@MainActivity,
                "Page Reset", Toast.LENGTH_LONG
            ).show()
        }








    }



}