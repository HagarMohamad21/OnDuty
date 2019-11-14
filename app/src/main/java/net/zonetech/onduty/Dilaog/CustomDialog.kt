package net.zonetech.onduty.Dilaog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.custom_dialog.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.setupFonts

class CustomDialog (context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog)
        context.setupFonts(findViewById(android.R.id.content))
        setListeners()

    }

    private fun setListeners() {
        changeBtn.setOnClickListener {
            dismiss()
        }
        forceBtn.setOnClickListener {
            dismiss()
        }
        closeBtn.setOnClickListener {
            dismiss()
        }
    }
}