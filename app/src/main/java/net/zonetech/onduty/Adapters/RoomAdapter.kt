package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.room_service_list_item.view.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate

class RoomAdapter(var context: Context,var services:ArrayList<String>) :RecyclerView.Adapter<RoomAdapter.RoomHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=RoomHolder(context.inflate(R.layout.room_service_list_item,p0))

    override fun getItemCount()=services.size

    override fun onBindViewHolder(p0: RoomHolder, p1: Int) {
        p0.bind(p1)
    }


    inner class RoomHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pos: Int) {
            itemView.serviceCheckBox.text=(services[pos])
        }
    }
}