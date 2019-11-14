package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_personal.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.PersonalAdapter
import net.zonetech.onduty.FixedLists.initPersonalList
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupMenu
import net.zonetech.onduty.Utils.setupFonts

class PersonalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal)
       initViews()
        setupMenu(menuIcon)
        setupBack(backIcon)
    }



    private fun initViews() {
        setupFonts()
        populateList()
    }

    private fun populateList() {
        var adapter= PersonalAdapter(this,initPersonalList())
        personalList.layoutManager= LinearLayoutManager(this)
        personalList.addItemDecoration(ItemDecoration(this))
        personalList.adapter=adapter
    }
}
