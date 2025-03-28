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

        //To assign values to the different buttons and TextViews ID's
        val ResetPageButton = findViewById<Button>(R.id.ResetPageButton)
        val ShowSuggestionsButton = findViewById<Button>(R.id.ShowSuggestionsButton)
        val TimeOfDayText = findViewById<TextView>(R.id.TimeOfDayText)
        val DisplayTextView = findViewById<TextView>(R.id.DisplayTextView)

        //To open the button to provide designated code
        ShowSuggestionsButton?.setOnClickListener {

            //Code to Clear the DisplayTextView when button is clicked
            DisplayTextView.text = ""

            //Creating a pop-up that'll show up when button is clicked to confirm button being clicked
            Toast.makeText(
                this@MainActivity,
                "Suggestions Shown", Toast.LENGTH_LONG
            ).show()

            //Creating IF function to convert the users inputted words to assign a specified response to show up
            if (TimeOfDayText.text.toString() == ("Morning") || TimeOfDayText.text.toString() == ("morning")) {
                DisplayTextView.setText("Avocado Toast, Boiled Eggs, Omelet")
            }
            //use of else statement to display the response to the specified word of option
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




        //Start of Reset button to revert the page back to start up
        ResetPageButton?.setOnClickListener {

            //Code to clear the input textview and the display textview to provide the options as well in display textview
            TimeOfDayText.text = ""
            DisplayTextView.text = "Options for time of Day:Morning,Mid-Morning,Afternoon,Mid-Afternoon,Dinner,After-Dinner"

            //to create a pop-up when the reset button is clicked to show it's been clicked
            Toast.makeText(
                this@MainActivity,
                "Page Reset", Toast.LENGTH_LONG
            ).show()
        }








    }



}