package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate

class MessagesAdapter(var context: Context)  : RecyclerView.Adapter<MessagesAdapter.MessageHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)= MessageHolder (context.inflate(R.layout.message_list_item,p0))

    override fun getItemCount()=4

    override fun onBindViewHolder(p0: MessageHolder, p1: Int) {
    }


    inner class MessageHolder(itemView: View) : RecyclerView.ViewHolder(itemView){}
}