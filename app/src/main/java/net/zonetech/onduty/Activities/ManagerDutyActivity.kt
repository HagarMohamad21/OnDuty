package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_manager_duty.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.ReportsAdapter
import net.zonetech.onduty.FixedLists.initManagerReports
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.Common
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class ManagerDutyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager_duty)
        setupFonts()
        setupBack(menuIcon, false)
        populateList()
    }

    private fun populateList() {
        managerList.layoutManager=LinearLayoutManager(this)
        managerList.addItemDecoration(ItemDecoration(this))
        managerList.adapter=ReportsAdapter(this,initManagerReports(), Common.MANAGER_REPORT)
    }
}
