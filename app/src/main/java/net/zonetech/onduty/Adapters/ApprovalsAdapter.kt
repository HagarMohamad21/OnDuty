package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.setupFonts

class ApprovalsAdapter(var context: Context) : RecyclerView.Adapter<ApprovalsAdapter.ApprovalHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ApprovalHolder {
       val view= context.inflate(R.layout.approval_list_item,p0)
        return ApprovalHolder(view)
    }

    override fun getItemCount()=3

    override fun onBindViewHolder(p0: ApprovalHolder, p1: Int) {
        p0.bind()
    }


    inner class ApprovalHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind() {
            context.setupFonts(itemView)
        }
    }
}