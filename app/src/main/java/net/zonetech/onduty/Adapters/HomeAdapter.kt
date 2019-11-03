package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.PersonalActivity
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
    private var isShown=false
    inner class RegularHomeHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        fun bind(pos: Int) {
            Fonts(context).setupFonts(itemView)
            if(pos==5){
                itemView.dropDownArrow.toggleVisibilty(true)
            }
            itemView.regularTxtView.text=homeList[pos]

            itemView.setOnClickListener{
                when(pos){
                    0->{
                     context.open(PersonalActivity(), null)
                    }
                    1->{

                    }
                    2->{}
                    3->{}
                    4->{}
                    5->{ if(!isShown){
                            context.loadAnimation(R.anim.slide_down,itemView.innerList)
                            isShown=true
                            itemView.innerList.toggleVisibilty(true)
                        } else{
                            context.loadAnimation(R.anim.slide_up,itemView.innerList)
                            isShown=false
                            itemView.innerList.toggleVisibilty(false)
                        } }
                    6->{}
                    7->{}
                    8->{}
                }

            }




        }

    }


}

