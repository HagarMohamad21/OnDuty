package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_messages.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.MessagesAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class MessagesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)
        setupFonts()
        setupBack(menuIcon)
        setListeners()
        populateList()
    }

    private fun populateList() {
        messagesList.layoutManager=LinearLayoutManager(this)
        messagesList.addItemDecoration(ItemDecoration(this))
        messagesList.adapter=MessagesAdapter(this)
    }

    private fun setListeners() {
        sendMessageBtn.setOnClickListener {
            open(MessageActivity(),null)
        }
    }
}
