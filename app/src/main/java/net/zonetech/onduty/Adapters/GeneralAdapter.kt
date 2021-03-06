package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.CompanyActivity
import net.zonetech.onduty.Activities.RestrauntsActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class GeneralAdapter (var context: Context,var generalList:ArrayList<String>): RecyclerView.Adapter<GeneralAdapter.GeneralHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=GeneralHolder(context.inflate(R.layout.home_list_item,p0))

    override fun getItemCount()=generalList.size

    override fun onBindViewHolder(p0: GeneralHolder, p1: Int) {
      p0.bind(p1)
    }


    inner class GeneralHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
            itemView.regularTxtView.text=generalList[pos]
            itemView.setOnClickListener {
                when(pos){
                    0->{
                        context.open(CompanyActivity(),null)
                    }
                    2->{
                        context.open(RestrauntsActivity(),null)
                    }
                }
            }
        }
    }
}