package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.HomeAdapter
import net.zonetech.onduty.FixedLists.initHomeList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupMenu(menuIcon)
        initViews()
        setListeners()
        setupBack(backIcon)
    }

    private fun setListeners() {
        phoneBtn.setOnClickListener {
            open(EmergencyActivity(),null)
        }
    }

    private fun initViews() {
        setupFonts()
        menuIcon.text=getString(R.string.menuIcon)
        populateList()
    }

    private fun populateList() {
        var homeAdapter=HomeAdapter(this,initHomeList())
        homeList.addItemDecoration(ItemDecoration(this))
        homeList.layoutManager=LinearLayoutManager(this)
        homeList.adapter=homeAdapter
    }
}
