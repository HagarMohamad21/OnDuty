package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.Activities.EditLeaveActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class RequestedLeavesAdapter(var context: Context) :
    RecyclerView.Adapter<RequestedLeavesAdapter.RequestedLeaveHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RequestedLeaveHolder {
        val view=context.inflate(R.layout.requested_leave_list_item,p0)
        return RequestedLeaveHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(p0: RequestedLeaveHolder, p1: Int) {
        p0.bind()
    }


    inner class RequestedLeaveHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            itemView.setOnClickListener {
                context.open(EditLeaveActivity(),null)
            }
        }
    }
}