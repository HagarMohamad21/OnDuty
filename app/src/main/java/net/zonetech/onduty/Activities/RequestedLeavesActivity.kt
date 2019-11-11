package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_requested_leaves.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.RequestedLeavesAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RequestedLeavesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requested_leaves)
        setupFonts()
        populateList()
        setupBack(menuIcon, false)
    }

    private fun populateList() {
        requestedLeavesList.layoutManager=LinearLayoutManager(this)
        requestedLeavesList.adapter=RequestedLeavesAdapter(this)
        requestedLeavesList.addItemDecoration(ItemDecoration(this))

    }

}
