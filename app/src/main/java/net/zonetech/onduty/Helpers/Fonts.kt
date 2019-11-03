package net.zonetech.onduty.Helpers

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fonts (var context: Context){
    var iconTypeFace:Typeface?=null

    init {
        iconTypeFace= Typeface.createFromAsset(context.assets,"fonts/onduty.ttf")
    }

    fun setupFonts(view:View){
        if(view is ViewGroup){
           for( i  in 0 until   view.childCount){
               val childView=view.getChildAt(i)
               setupFonts(childView)
           }
        }
        else if(view is TextView){
            if(view.tag!=null){
                if(view.tag == "icon"){
                    view.typeface=iconTypeFace
                }
            }

        }
    }
}