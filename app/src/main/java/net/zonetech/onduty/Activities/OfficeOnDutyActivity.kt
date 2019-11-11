package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_office_on_duty.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.EmployeesAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class OfficeOnDutyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_on_duty)
        setupFonts()
        setupBack(menuIcon, false)
        populateList()
    }

    private fun populateList() {
        onDutyEmployeeList.layoutManager=LinearLayoutManager(this)
        onDutyEmployeeList.addItemDecoration(ItemDecoration(this))
        onDutyEmployeeList.adapter=EmployeesAdapter(this)
    }
}
