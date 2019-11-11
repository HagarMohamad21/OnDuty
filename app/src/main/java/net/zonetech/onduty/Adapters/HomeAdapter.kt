package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.*
import net.zonetech.onduty.Helpers.Fonts
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.loadAnimation
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.toggleVisibilty

class HomeAdapter(var context: Context,var homeList:ArrayList<String>) : RecyclerView.Adapter<HomeAdapter.RegularHomeHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RegularHomeHolder {

            val view = context.inflate(R.layout.home_list_item,p0)
            return RegularHomeHolder(view)


    }



    override fun getItemCount(): Int {
             return homeList.size    }

    override fun onBindViewHolder(p0: RegularHomeHolder, p1: Int) {
        p0.bind(p1)
    }
    inner class RegularHomeHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        fun bind(pos: Int) {
            Fonts(context).setupFonts(itemView)
            if(pos==5){

            }
            itemView.regularTxtView.text=homeList[pos]

            itemView.setOnClickListener{
                when(pos){
                    0->{
                     context.open(PersonalActivity(), null)
                    }
                    1->{
                     context.open(MyOfficeActivity(),null)
                    }
                    2->{
                        context.open(GeneralActivity(),null)
                    }
                    3->{
                        context.open(DepartmentsActivity(),null)
                    }
                    4->{
                        context.open(MessagesActivity(),null)
                    }

                    5->{
                        context.open(MeetingsActivity(),null)
                    }

                    6->{
                        context.open(CustomSelectionActivity(),null)
                    }
                    7->{
                        context.open(HRActivity(),null)
                    }
                    8->{
                        context.open(ReportsActivity(),null)
                    }
                }

            }




        }

    }


}

