package net.zonetech.onduty.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import net.zonetech.onduty.Activities.TaskActivity
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.inflate
import net.zonetech.onduty.Utils.open

class TasksAdapter(var context: Context) :RecyclerView.Adapter<TasksAdapter.TaskHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int)=TaskHolder(context.inflate(R.layout.task_list_item,p0))

    override fun getItemCount()=5

    override fun onBindViewHolder(p0: TaskHolder, p1: Int) {
       p0.bind()
    }


    inner class TaskHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind() {
            itemView.setOnClickListener {
                context.open(TaskActivity(),null)
            }
        }
    }
}