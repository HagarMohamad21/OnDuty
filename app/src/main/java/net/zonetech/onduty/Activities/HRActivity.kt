package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hr.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.HrAdapter
import net.zonetech.onduty.FixedLists.initHrList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupMenu
import net.zonetech.onduty.Utils.setupFonts

class HRActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hr)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setupBack(backIcon)
    }

    private fun populateList() {
        HrList.layoutManager=LinearLayoutManager(this)
        HrList.addItemDecoration(ItemDecoration(this))
        HrList.adapter=HrAdapter(this,initHrList())

    }
}
