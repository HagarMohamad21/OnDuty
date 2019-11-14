package net.zonetech.onduty.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.snippet_toolbar.*
import net.zonetech.onduty.R
import net.zonetech.onduty.Utils.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
        setupFonts()
        setListeners()
        setupBack(backIcon)
        setupMenu(menuIcon)
    }

    private fun initViews() {
        menuIcon.text=getString(R.string.menuIcon)
        titleTxt.text=getString(R.string.login)
        if(intent.getStringExtra("EXTRA")!=null){
            userNameEditTxt.setText("123456GSFGAVKCV")
            forgotPasswordTxt.toggleVisibilty(false)
            forgotUserNameTxt.toggleVisibilty(false)
        }
    }

    private fun setListeners() {
        loginBtn.setOnClickListener {
            if(intent.getStringExtra("EXTRA")=="Extras"){
                open(BussinessCardActivity(),null)
                       }
            else if (intent.getStringExtra("EXTRA")=="Extras2"){
                open(VacationsActivity(),null)
            }
            else
            open(HomeActivity(), null)
        }
    }
}
