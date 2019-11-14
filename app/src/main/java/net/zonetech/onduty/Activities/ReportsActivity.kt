package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_reports.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.ReportsAdapter
import net.zonetech.onduty.FixedLists.initReports
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class ReportsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reports)
        setupMenu(menuIcon)
        setupFonts()
        populateList()
        setupBack(backIcon)
    }

    private fun populateList() {
        reportList.addItemDecoration(ItemDecoration(this))
        reportList.layoutManager=LinearLayoutManager(this)
        reportList.adapter= ReportsAdapter(this,initReports(), Common.REPORT)
    }
}
