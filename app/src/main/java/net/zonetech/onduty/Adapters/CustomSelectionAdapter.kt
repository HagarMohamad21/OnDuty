package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_message.view.*
import kotlinx.android.synthetic.main.custom_selection_list_item.view.*
import net.zonetech.onduty.Activities.EmployeeActivity
import net.zonetech.onduty.Dilaog.CustomDialog
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class CustomSelectionAdapter(var context: Context,var showCheckBox: Boolean,var showInfo:Boolean) : RecyclerView.Adapter<CustomSelectionAdapter.SelectionHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=SelectionHolder(context.inflate(R.layout.custom_selection_list_item,p0))

    override fun getItemCount()=10

    override fun onBindViewHolder(p0: SelectionHolder, p1: Int) {
        p0.bind(p1)
    }


    inner class SelectionHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(pos: Int) {
                context.setupFonts(itemView)
             itemView.employeeCheckbox.toggleVisibilty(showCheckBox)

            itemView.setOnClickListener {
                context.open(EmployeeActivity(),null)
            }

            if(!showCheckBox){
                if(pos%2==0){
                    itemView.employeeNameTxt.changeColor(R.color.blueAccent,context)
                }
            }

            itemView.infoIcon.toggleVisibilty(showInfo&&pos%3==0)

          itemView.infoIcon.setOnClickListener {
              //open dialog with that message
              var customDialog=CustomDialog(context)
              customDialog.show()
          }

        }

    }
}