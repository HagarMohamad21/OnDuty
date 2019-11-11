package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_roster.requestLeaveBtn
import kotlinx.android.synthetic.main.activity_vacations.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class VacationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacations)
        setupFonts()
       setListeners()
        setupBack(menuIcon, false)
    }

    private fun setListeners() {

        requestLeaveBtn.setOnClickListener {
            open(RequestLeaveActvity(),null)
        }
        requstedLeavesBtn.setOnClickListener {
            open(RequestedLeavesActivity(),null)
        }
    }
}