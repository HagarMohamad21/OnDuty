package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_my_office.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.OfficeAdapter
import net.zonetech.onduty.FixedLists.initOfficeList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class MyOfficeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_office)
        setupFonts()
        setupBack(menuIcon)
        populateList()
    }

    private fun populateList() {
        officeList.layoutManager=LinearLayoutManager(this)
        officeList.adapter=OfficeAdapter(this,initOfficeList())
    }
}
