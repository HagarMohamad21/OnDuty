package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_message.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        setupFonts()
        initViews()
        setupBack(menuIcon, false)
        setListeners()
    }

    private fun initViews() {
        replySpinner.isEnabled=false
    }

    private fun setListeners() {
     employeesSpinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
         override fun onNothingSelected(parent: AdapterView<*>?) {
         }

         override fun onItemSelected(
             parent: AdapterView<*>?,
             view: View?,
             position: Int,
             id: Long
         ) {
             if(position==5){
                 open(CustomSelectionActivity(),null)
             }
         }

     }
     replyCheckBox.setOnCheckedChangeListener{_,isChecked->
         replySpinner.isEnabled = isChecked
     }

    }
}
