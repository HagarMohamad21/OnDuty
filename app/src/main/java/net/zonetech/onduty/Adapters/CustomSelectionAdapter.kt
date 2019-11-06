package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate

class CustomSelectionAdapter(var context: Context) : RecyclerView.Adapter<CustomSelectionAdapter.SelectionHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=SelectionHolder(context.inflate(R.layout.custom_selection_list_item,p0))

    override fun getItemCount()=10

    override fun onBindViewHolder(p0: SelectionHolder, p1: Int) {
    }


    inner class SelectionHolder(itemView: View) : RecyclerView.ViewHolder(itemView){}
}