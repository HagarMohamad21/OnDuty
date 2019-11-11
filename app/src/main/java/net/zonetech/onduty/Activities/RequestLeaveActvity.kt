package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_request_leave.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RequestLeaveActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_leave_actvity)
        setupFonts()
        initViews()
        setupBack(menuIcon, false)
    }

    private fun initViews() {
        if(intent.getStringExtra("EXTRA")!=null){
            startEditTxt.setText(intent.getStringExtra("EXTRA"))
        }
         leaveSpinner.adapter.getView(0,null,null).isEnabled=false
    }


}
