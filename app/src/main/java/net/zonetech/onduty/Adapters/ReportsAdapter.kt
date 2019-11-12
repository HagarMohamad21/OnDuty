package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.Common
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class ReportsAdapter(var context: Context,var reports:ArrayList<String>,var reportType:Int) :RecyclerView.Adapter<ReportsAdapter.ReportHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=ReportHolder(context.inflate(R.layout.home_list_item,p0))

    override fun getItemCount()=reports.size

    override fun onBindViewHolder(p0: ReportHolder, p1: Int) {
      p0.bind(p1)
    }


    inner class ReportHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
            itemView.regularTxtView.text=reports[pos]
            itemView.setOnClickListener {
                when(pos){
                    0->{
                        context.open(ManagerDutyActivity(),null)
                    }
                    1->{
                        context.open(IncidentReportsActivity(),null)
                    }
                }
            }
        if(reportType==Common.MANAGER_REPORT){
          itemView.setOnClickListener {
              when(pos){
                  0,2,3,4->{
                     context.open(WalkAroundActivity(),null)
                  }
                  1->{
                      context.open(RoomInspectionActivity(),null)
                  }
                  5->{
                      context.open(GuestActivity(),null)
                  }
                  6->{
                      context.open(StaffAwarenessActivity(),null)
                  }
              }
          }
        }
            else if(reportType==Common.ROOM_REPORTS){
            itemView.setOnClickListener {
                when(pos){
                    0->{
                        context.open(RoomActivity(),null)
                    }


                }
            }
        }

        }
    }
}