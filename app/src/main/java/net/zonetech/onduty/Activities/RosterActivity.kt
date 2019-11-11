package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_roster.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*
import java.text.SimpleDateFormat
import java.util.*


class RosterActivity : AppCompatActivity() {
     var selectedDate=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(net.zonetech.onduty.R.layout.activity_roster)
        initViews()
        setupFonts()
        setupBack(menuIcon, false)
        setListeners()
    }

    private fun initViews() {
        val date = Calendar.getInstance().time
        val formatter = SimpleDateFormat("dd/mm/yyyy") //or use getDateInstance()
        selectedDate = formatter.format(date)
    }

    private fun setListeners() {

        calendar.setOnDateChangeListener { _, year, month, dayOfMonth ->
            loadAnimation(R.anim.slide_down,dutyDesView)
            selectedDate="$dayOfMonth/$month/$year"
        }
        requestLeaveBtn.setOnClickListener {
            open(RequestLeaveActvity(),selectedDate)
        }
        changeDutyTxt.setOnClickListener {
            open(ChangeDutyHoursActivity(),null)
        }
}}
