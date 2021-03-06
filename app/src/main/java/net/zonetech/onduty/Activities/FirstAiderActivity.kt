package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_first_aider.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.FirstAidAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class FirstAiderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aider)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setListeners()
        setupBack(backIcon)
    }

    private fun setListeners() {
        messageBtn.setOnClickListener {
            open(MessageActivity(),null)
        }
    }

    private fun populateList() {
        firstAiderList.layoutManager=LinearLayoutManager(this)
        firstAiderList.addItemDecoration(ItemDecoration(this))
        firstAiderList.adapter=FirstAidAdapter(this)
    }
}
