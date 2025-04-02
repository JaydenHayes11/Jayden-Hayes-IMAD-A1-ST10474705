package za.co.varsitycollege.imad_a1_st10474705

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //To assign values to the different buttons and TextViews ID's
        val resetPageButton = findViewById<Button>(R.id.ResetPageButton)
        val showSuggestionsButton = findViewById<Button>(R.id.ShowSuggestionsButton)
        val timeOfDayText = findViewById<TextView>(R.id.TimeOfDayText)
        val displayTextView = findViewById<TextView>(R.id.DisplayTextView)

        //To open the button to provide designated code
        showSuggestionsButton?.setOnClickListener {

            //Code to Clear the DisplayTextView when button is clicked
            displayTextView.text = ""

            //Creating a pop-up that'll show up when button is clicked to confirm button being clicked
            Toast.makeText(
                this@MainActivity,
                "Suggestions Shown", Toast.LENGTH_LONG
            ).show()

            //Creating IF function to convert the users inputted words to assign a specified response to show up
            if (timeOfDayText.text.toString() == ("Morning") || timeOfDayText.text.toString() == ("morning")) {
                displayTextView.text = "Avocado Toast, Boiled Eggs, Omelet"
            }
            //use of else statement to display the response to the specified word of option
            else if (timeOfDayText.text.toString() == ("Mid-Morning") || timeOfDayText.text.toString() == ("mid-morning")) {
                displayTextView.text = "Muffins, Bagels, Fruit"
            }
            else if (timeOfDayText.text.toString() == ("Afternoon") || timeOfDayText.text.toString() == ("afternoon")) {
                displayTextView.text = "Sandwich, French Toast, Salad"
            }
            else if (timeOfDayText.text.toString() == ("Mid-Afternoon") || timeOfDayText.text.toString() == ("mid-afternoon")) {
                displayTextView.text = "Instant Noodles, Burritos, Pasta"
            }
            else if (timeOfDayText.text.toString() == ("Dinner") || timeOfDayText.text.toString() == ("dinner")) {
                displayTextView.text = "Spaghetti, Butter Chicken, Pizza"
            }
            else if (timeOfDayText.text.toString() == ("After-Dinner") || timeOfDayText.text.toString() == ("after-dinner")) {
                displayTextView.text = "Ice Cream, CupCakes, MilkShakes"
            }
            else{
                displayTextView.text = "Invalid Option Entered"
            }


        }




        //Start of Reset button to revert the page back to start up
        resetPageButton?.setOnClickListener {

            //Code to clear the input textview and the display textview to provide the options as well in display textview
            timeOfDayText.text = ""
            displayTextView.text = "Options for time of Day:Morning,Mid-Morning,Afternoon,Mid-Afternoon,Dinner,After-Dinner"

            //to create a pop-up when the reset button is clicked to show it's been clicked
            Toast.makeText(
                this@MainActivity,
                "Page Reset", Toast.LENGTH_LONG
            ).show()
        }








    }



}