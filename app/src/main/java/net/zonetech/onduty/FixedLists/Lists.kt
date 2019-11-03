package net.zonetech.onduty.FixedLists

import android.content.Context
import net.zonetech.onduty.R


fun Context.initHomeList() :ArrayList<String>{
        var homeList=ArrayList<String>()
         homeList.add(getString(R.string.personal))
         homeList.add(getString(R.string.myOffice))
         homeList.add(getString(R.string.general))
         homeList.add(getString(R.string.departments))
         homeList.add(getString(R.string.messages))
         homeList.add(getString(R.string.action))
         homeList.add(getString(R.string.contacts))
         homeList.add(getString(R.string.hrOffice))
         homeList.add(getString(R.string.reports))
return homeList}
fun Context.initPersonalList():ArrayList<String>{
 val personalList=ArrayList<String>()

  personalList.add(getString(R.string.personal_card))
  personalList.add(getString(R.string.bussinessCard))
  personalList.add(getString(R.string.leavesPh))
  personalList.add(getString(R.string.roster))


return personalList}