package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.Activities.MeetingsDetailsActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class MeetingsAdapter (var context: Context): RecyclerView.Adapter<MeetingsAdapter.MeetingsHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=MeetingsHolder(context.inflate(R.layout.meeting_list_item,p0))

    override fun getItemCount()=6

    override fun onBindViewHolder(p0: MeetingsHolder, p1: Int) {
        p0.bind(p1)
    }


    inner class MeetingsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
         itemView.setOnClickListener {
             context.open(MeetingsDetailsActivity(),null)
         }
        }
    }
}