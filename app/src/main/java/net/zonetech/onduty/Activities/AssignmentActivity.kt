package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class AssignmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment)
        setupFonts()
        setupBack(menuIcon)
    }
}
   