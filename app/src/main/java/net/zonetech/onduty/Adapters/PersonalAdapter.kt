package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home_list_item.view.*
import net.zonetech.onduty.Activities.BussinessCardActivity
import net.zonetech.onduty.Activities.LoginActivity
import net.zonetech.onduty.Activities.PersonalCardActivity
import net.zonetech.onduty.Activities.RosterActivity
import net.zonetech.onduty.Helpers.Fonts
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class PersonalAdapter(var context: Context,var personalList:ArrayList<String> )
    :RecyclerView.Adapter<PersonalAdapter.PersonalHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonalHolder {
     val view=context.inflate(R.layout.home_list_item,p0)
      return PersonalHolder(view)
    }

    override fun getItemCount(): Int {
        return personalList.size
    }

    override fun onBindViewHolder(p0: PersonalHolder, p1: Int) {
      p0.bind(p1)
    }


    inner class PersonalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
            Fonts(context).setupFonts(itemView)
            itemView.regularTxtView.text=personalList[pos]
            itemView.setOnClickListener{
                when(pos){
                    0->{
                        context.open(PersonalCardActivity(), null)
                    }
                    1->{
                        context.open(LoginActivity(),"Extras")
                    }
                    2->{
                        context.open(LoginActivity(),"Extras2")
                    }
                    3->{
                        context.open(RosterActivity(),null)
                    }
                }
            }
        }

    }
}