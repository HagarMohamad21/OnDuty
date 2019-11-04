package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_roster.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Utils.setupFonts
import android.widget.Toast
import android.widget.CalendarView.OnDateChangeListener
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.loadAnimation
import net.zonetech.onduty.Utils.toggleVisibilty


class RosterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(net.zonetech.onduty.R.layout.activity_roster)
        setupFonts()
        setListeners()
    }

    private fun setListeners() {
        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            loadAnimation(R.anim.slide_down,dutyDesView)
        }
        menuIcon.setOnClickListener {
            finish()
        }
}}
