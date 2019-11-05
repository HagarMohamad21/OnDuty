package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.approval_list_item.view.*
import net.zonetech.onduty.Activities.EmployeeActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.toggleVisibilty

class EmployeesAdapter(var context: Context) : RecyclerView.Adapter<EmployeesAdapter.EmployeeHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=EmployeeHolder(context.inflate(R.layout.approval_list_item,p0))

    override fun getItemCount()=8

    override fun onBindViewHolder(p0: EmployeeHolder, p1: Int) {
     p0.bind(p1)
    }


    inner class EmployeeHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pos: Int) {
            itemView.leftMostTxt.text="Ali Muhammad"
            itemView.rightMostTxt.text="09:00-18:00"
             itemView.rightMostTxt.setTextColor(ContextCompat.getColor(context,R.color.grey))
            itemView.eyeIcon.toggleVisibilty(false)
            itemView.setOnClickListener {
                context.open(EmployeeActivity(),null)
            }

        }
    }
}