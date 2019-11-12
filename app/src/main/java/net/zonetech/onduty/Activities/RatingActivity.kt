package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_staff_awareness.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RatingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)
        setupFonts()
        setupBack(menuIcon,false)
        setListeners()
    }
    private fun setListeners() {
        ratingEditTxt.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                when(s.toString()){

                    "1","2","3"->{
                        ratingTxt.text="Need to improve"
                    }
                    "4","5","6"->{
                        ratingTxt.text="Okay"
                    }
                    "7","8"->{
                        ratingTxt.text="Good"
                    }
                    "9","10"->{
                        ratingTxt.text="Excellent"
                    }
                }
            }
        })
    }
}
