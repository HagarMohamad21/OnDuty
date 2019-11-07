package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.form_list_item.view.*
import net.zonetech.onduty.Activities.FirstAiderActivity
import net.zonetech.onduty.Activities.MessageActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class EmergencyAdapter (var context: Context,var callList:ArrayList<String>)
    :RecyclerView.Adapter<EmergencyAdapter.EmergencyHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=EmergencyHolder(context.inflate(R.layout.form_list_item,p0))

    override fun getItemCount()=callList.size

    override fun onBindViewHolder(p0: EmergencyHolder, p1: Int) {
        p0.bind(p1)
    }

    inner class EmergencyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
            context.setupFonts(itemView)
            itemView.regularTxtView.text=callList[pos]
            itemView.downloadTxt.text=context.getString(R.string.messageIcon)
            itemView.downloadTxt.changeColor(R.color.colorAccent,context)
            itemView.downloadTxt.setOnClickListener {
                context.open(MessageActivity(),null)
            }
            if(pos==3||pos==6){
                itemView.downloadTxt.toggleVisibilty(false)
                if(pos==3){
                    itemView.setOnClickListener {
                        context.open(FirstAiderActivity(),null)
                    }
                }

            }
        }
    }
}