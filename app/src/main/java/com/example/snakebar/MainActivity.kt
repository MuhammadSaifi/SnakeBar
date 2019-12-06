package com.example.snakebar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// implementation 'com.android.support:design:28.0.0'
    /*
    * Snackbar will show the msgs in bottom of App page
    * it use for to show any type of actiones to user.
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun show(v: View){
        // Snackbat contains id of constraint layout and msg and length of display.
        // length can be short, Long ,infinite.
        val snakebar = Snackbar.make(layout,"Welcome To My App",Snackbar.LENGTH_SHORT)
        // for set the button inside our snackbar we will use following line of code.
        snakebar.setAction("CLOSE",View.OnClickListener {
            snakebar.dismiss()
        })
        // for change the color of button
         snakebar.setActionTextColor(ContextCompat.getColor(this,R.color.colorPrimary))

        // for change msg color
        val view = snakebar.view
        val text = view.findViewById<TextView>(R.id.snackbar_text)
        text.setTextColor(ContextCompat.getColor(this,R.color.colorAccent))

        text.setBackgroundColor(ContextCompat.getColor(this,R.color.backclr))




        snakebar.show()





    }
}
