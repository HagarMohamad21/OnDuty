package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.open
import net.zonetech.onduty.Utils.setupFonts

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
        setupFonts()
        setListeners()
    }

    private fun initViews() {
        menuIcon.text=getString(R.string.menuIcon)
        if(intent.getStringExtra("EXTRA")!=null){
            userNameEditTxt.setText("123456GSFGAVKCV")
        }
    }

    private fun setListeners() {
        loginBtn.setOnClickListener {
            if(intent.getStringExtra("EXTRA")!=null){
                open(BussinessCardActivity(),null)
            }
            else
            open(HomeActivity(), null)
        }
    }
}
