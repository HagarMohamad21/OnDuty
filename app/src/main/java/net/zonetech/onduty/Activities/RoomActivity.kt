package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_room.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.RoomAdapter
import net.zonetech.onduty.FixedLists.initServices
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        setupFonts()
        setupBack(menuIcon, false)
        populateList()
    }

    private fun populateList() {
    roomServices.layoutManager=LinearLayoutManager(this)
    roomServices.addItemDecoration(ItemDecoration(this))
    roomServices.adapter= RoomAdapter(this,initServices())
    }
}
