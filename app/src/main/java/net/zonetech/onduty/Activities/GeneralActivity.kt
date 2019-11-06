package net.zonetech.onduty.Activities

import android.arch.lifecycle.GeneratedAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_general.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.GeneralAdapter
import net.zonetech.onduty.FixedLists.initGeneralList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class GeneralActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)
        setupFonts()                              
        setupBack(menuIcon)
        populateList()
    }

    private fun populateList() {
        generalList.layoutManager=LinearLayoutManager(this)
        generalList.adapter=GeneralAdapter(this,initGeneralList())

    }
}
