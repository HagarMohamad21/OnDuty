package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_meetings.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.MeetingsAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class MeetingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meetings)
        setupFonts()
        setupBack(menuIcon, false)
        populateList()
        setListeners()

    }

    private fun setListeners() {
        createMeetingsBtn.setOnClickListener {
            open(CreateMeetingActivity(),null)
        }
    }

    private fun populateList() {
        meetingsList.layoutManager=LinearLayoutManager(this)
        meetingsList.adapter= MeetingsAdapter(this)
        meetingsList.addItemDecoration(ItemDecoration(this))
    }
}
