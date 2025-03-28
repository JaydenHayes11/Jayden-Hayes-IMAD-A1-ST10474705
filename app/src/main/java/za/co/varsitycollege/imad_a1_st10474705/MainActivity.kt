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
            if (TimeOfDayText.text.toString() == ("Morning") || TimeOfDayText.text.toString() == ("morning")) {
                DisplayTextView.setText("Avocado Toast, Boiled Eggs, Omelet")
            }
            else if (TimeOfDayText.text.toString() == ("Mid-Morning") || TimeOfDayText.text.toString() == ("mid-morning")) {
                DisplayTextView.setText("Muffins, Bagels, Fruit")
            }
            else if (TimeOfDayText.text.toString() == ("Afternoon") || TimeOfDayText.text.toString() == ("afternoon")) {
                DisplayTextView.setText("Sandwich, French Toast, Salad")
            }
            else if (TimeOfDayText.text.toString() == ("Mid-Afternoon") || TimeOfDayText.text.toString() == ("mid-afternoon")) {
                DisplayTextView.setText("Instant Noodles, Burritos, Pasta")}
            else if (TimeOfDayText.text.toString() == ("Dinner") || TimeOfDayText.text.toString() == ("dinner")) {
                DisplayTextView.setText("Spaghetti, Butter Chicken, Pizza")}
            else if (TimeOfDayText.text.toString() == ("After-Dinner") || TimeOfDayText.text.toString() == ("after-dinner")) {
                DisplayTextView.setText("Ice Cream, CupCakes, MilkShakess")}
            else{
                DisplayTextView.setText("Invalid Option Entered")
            }


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