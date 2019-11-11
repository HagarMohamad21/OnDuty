package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_restraunts.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.Adapters.RestaurantsAdapter
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.ItemDecoration
import net.zonetech.onduty.Utils.setupBack
import net.zonetech.onduty.Utils.setupFonts

class RestrauntsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restraunts)
        setupBack(menuIcon, false)
        setupFonts()
        populateList()
    }

    private fun populateList() {
        restaurantsList.layoutManager=LinearLayoutManager(this)
        restaurantsList.addItemDecoration(ItemDecoration(this))
        restaurantsList.adapter=RestaurantsAdapter(this)

    }
}
