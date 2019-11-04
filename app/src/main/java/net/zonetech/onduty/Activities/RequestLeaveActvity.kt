package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_request_leave_actvity.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupFonts

class RequestLeaveActvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_leave_actvity)
        setupFonts()
        initViews()
    }

    private fun initViews() {
        if(intent.getStringExtra("EXTRA")!=null){
            startEditTxt.setText(intent.getStringExtra("EXTRA"))
        }
        leaveSpinner.adapter.getView(0,null,null).isEnabled=false
    }
}
