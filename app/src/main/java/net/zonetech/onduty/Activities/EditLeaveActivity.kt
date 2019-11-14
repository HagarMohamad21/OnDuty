package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_edit_leave.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.ApprovalsAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupMenu
import net.zonetech.onduty.Utils.setupFonts

class EditLeaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_leave)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setupBack(backIcon)
    }

    private fun populateList() {
        approvalsList.layoutManager=LinearLayoutManager(this)
        approvalsList.adapter=ApprovalsAdapter(this)
        approvalsList.addItemDecoration(ItemDecoration(this))
    }


}
