package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.FormsActivity
import net.zonetech.onduty.Activities.RatingActivity
import net.zonetech.onduty.Activities.TransportationActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class HrAdapter(var context: Context,var hrList:ArrayList<String>) :RecyclerView.Adapter<HrAdapter.HrHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)= HrHolder(context.inflate(R.layout.home_list_item,p0))

    override fun getItemCount()=hrList.size

    override fun onBindViewHolder(p0: HrHolder, p1: Int) {
      p0.bind(p1)
    }


    inner class HrHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pos: Int) {
            itemView.regularTxtView.text=hrList[pos]
            itemView.setOnClickListener {
                when(pos){
                  0->{
                      context.open(TransportationActivity(),null)
                  }
                    3->{
                        context.open(FormsActivity(),null)
                    }
                    4->{
                        context.open(RatingActivity(),null)
                    }
                }
            }
        }
    }
}