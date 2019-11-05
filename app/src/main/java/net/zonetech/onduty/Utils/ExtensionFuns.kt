package net.zonetech.onduty.Utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import net.zonetech.onduty.Helpers.Fonts

fun Context.open(activity: Activity, extras: String?){
    var intent=Intent(this,activity::class.java)
    if (extras != null) {
    intent.putExtra("EXTRA",extras)
    }
    startActivity(intent)
}

fun Activity.setupFonts(){
    Fonts(this).setupFonts(findViewById(android.R.id.content))
}
fun Activity.setupBack(view: View){
    view.setOnClickListener {
        finish()
    }
}
fun Context.setupFonts(itemView:View){
    Fonts(this).setupFonts(itemView)
}

fun Context.inflate(layout:Int,viewGroup: ViewGroup?):View{
    val view =LayoutInflater.from(this).inflate(layout,viewGroup,false)
     return view
}

fun View.toggleVisibilty(show:Boolean){
    if(show)
    this.visibility=View.VISIBLE
    else
        this.visibility=View.GONE
}

fun Context.loadAnimation(animation:Int,view:View){
    var animation=AnimationUtils.loadAnimation(this,animation)
    if (animation != null) {
        animation.reset()
        if (view != null) {
            view.clearAnimation()
            view.startAnimation(animation)
        }
    }
}