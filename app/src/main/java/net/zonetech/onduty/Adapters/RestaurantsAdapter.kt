package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.Activities.RestaurantDetailsActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class RestaurantsAdapter(var context: Context) :RecyclerView.Adapter<RestaurantsAdapter.RestaurantsHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)= RestaurantsHolder(context.inflate(R.layout.rest_list_item,p0))

    override fun getItemCount()=7

    override fun onBindViewHolder(p0: RestaurantsHolder, p1: Int) {
        p0.bind(p1)
    }

    inner class RestaurantsHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pos: Int) {
           itemView.setOnClickListener {
               context.open(RestaurantDetailsActivity(),null)
           }
        }
    }
}