package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class CreateBriefingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_briefing)
        setupFonts()
        setupBack(menuIcon)
    }
}
