package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_custom_selection.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.CustomSelectionAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts
import net.zonetech.onduty.Utils.toggleVisibilty

class DepartmentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departments)
        setupBack(menuIcon, false)
        setupFonts()
        setListeners()
        initViews()
    }

    private fun initViews() {
        doneBtn.toggleVisibilty(false)
        selectAllBtn.toggleVisibilty(false)
    }

    private fun setListeners() {
        departmentSpinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                populateList()
            }
        }
    }

    private fun populateList() {
        selectionList.layoutManager= LinearLayoutManager(this)
        selectionList.addItemDecoration(ItemDecoration(this))
        selectionList.adapter= CustomSelectionAdapter(this,false)
    }
}
