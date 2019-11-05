package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class OfficeAdapter(var context: Context,var officeList:ArrayList<String>) :RecyclerView.Adapter<OfficeAdapter.OfficeHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=
        OfficeHolder(context.inflate(R.layout.home_list_item,p0))

    override fun getItemCount()=officeList.size

    override fun onBindViewHolder(p0: OfficeHolder, p1: Int) {
        p0.bind(p1)
    }

    private var isShown=false
    inner class OfficeHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bind(pos:Int) {
            context.setupFonts(itemView)
            itemView.regularTxtView.text=officeList[pos]
            if(pos==2) itemView.dropDownArrow.toggleVisibilty(true)
            itemView.setOnClickListener{
                when(pos){
                    0,1->{
                        context.open(OfficeOnDutyActivity(), null)
                    }

                    2->{
                        if(!isShown){
                            context.loadAnimation(R.anim.slide_down,itemView.handoverList)
                            isShown=true
                            itemView.handoverList.toggleVisibilty(true)
                        } else{
                            context.loadAnimation(R.anim.slide_up,itemView.handoverList)
                            isShown=false
                            itemView.handoverList.toggleVisibilty(false)
                        }
                        itemView.handoverList.followTaskTxt.setOnClickListener {
                            context.open(TasksToFollowActivity(),null)
                        }
                        itemView.handoverList.createTaskTxt.setOnClickListener {
                            context.open(CreateTaskActivity(),null)
                        }

                    }
                    3->{
                        context.open(BriefingActivity(),null)
                    }
                    4->{
                        context.open(MessagesActivity(),null)
                    }

                }
            }
        }
    }
}