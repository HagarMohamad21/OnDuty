package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_tasks_to_follow.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.TasksAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupMenu
import net.zonetech.onduty.Utils.setupFonts

class TasksToFollowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasks_to_follow)
        setupFonts()
        setupMenu(menuIcon)
        populateList()
        setupBack(backIcon)

    }

    private fun populateList() {
        tasksList.layoutManager=LinearLayoutManager(this)
        tasksList.addItemDecoration(ItemDecoration(this))
        tasksList.adapter=TasksAdapter(this)
    }
}
