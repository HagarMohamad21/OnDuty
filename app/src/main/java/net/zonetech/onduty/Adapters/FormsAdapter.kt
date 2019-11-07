package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.setupFonts

class FormsAdapter(var context: Context) :RecyclerView.Adapter<FormsAdapter.FormHolder> (){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=FormHolder(context.inflate(R.layout.form_list_item,p0))

    override fun getItemCount()=5

    override fun onBindViewHolder(p0: FormHolder, p1: Int) {
        p0.bind(p1)
    }


    inner class FormHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(pos: Int) {
            context.setupFonts(itemView)
        }

    }
}