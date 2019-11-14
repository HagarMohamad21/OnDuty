package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_forms.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.FormsAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupMenu
import net.zonetech.onduty.Utils.setupFonts

class FormsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forms)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setupBack(backIcon)
    }

    private fun populateList() {
      formsList.layoutManager=LinearLayoutManager(this)
     formsList.addItemDecoration(ItemDecoration(this))
     formsList.adapter=FormsAdapter(this    )

    }
}
