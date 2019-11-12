package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_room_inspection.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.ReportsAdapter
import net.zonetech.onduty.FixedLists.initRooms
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.Common
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RoomInspectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_inspection)
        setupBack(menuIcon, false)
        setupFonts()
        populateList()
    }

    private fun populateList() {
        roomList.addItemDecoration(ItemDecoration(this))
        roomList.layoutManager=LinearLayoutManager(this)
        roomList.adapter=ReportsAdapter(this,initRooms(),Common.ROOM_REPORTS)
    }
}