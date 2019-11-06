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
fun Context.initOfficeList():ArrayList<String>{
 val officeList=ArrayList<String>()

 officeList.add(getString(R.string.officeOnDuty))
 officeList.add(getString(R.string.officeDuty))
 officeList.add(getString(R.string.handovers))
 officeList.add(getString(R.string.briefing))
 officeList.add(getString(R.string.messages))


 return officeList
}
fun Context.initGeneralList():ArrayList<String>{
 val generalList=ArrayList<String>()
    generalList.add(getString(R.string.company))
    generalList.add(getString(R.string.meetingRooms))
    generalList.add(getString(R.string.resAndLounge))
    generalList.add(getString(R.string.spa))
    generalList.add(getString(R.string.recreationAndWater))
    generalList.add(getString(R.string.babySitter))
    generalList.add(getString(R.string.tennisCourt))
   generalList.add(getString(R.string.romanticsDinner))

 return generalList
}