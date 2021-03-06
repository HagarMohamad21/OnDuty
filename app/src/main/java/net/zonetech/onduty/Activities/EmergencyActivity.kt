package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_emergency.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.EmergencyAdapter
import net.zonetech.onduty.FixedLists.initCallList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class EmergencyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setListeners()
        setupBack(backIcon)
    }

    private fun setListeners() {
        assignBtn.setOnClickListener {
            open(AssignmentActivity(),null)
        }
    }

    private fun populateList() {
        callList.layoutManager=LinearLayoutManager(this)
        callList.addItemDecoration(ItemDecoration(this))
        callList.adapter=EmergencyAdapter(this,initCallList())
    }
}
