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
fun Context.initHrList():ArrayList<String>{
    val hrList=ArrayList<String>()
    hrList.add(getString(R.string.transportations))
    hrList.add(getString(R.string.staffCanteen))
    hrList.add(getString(R.string.staffMedical))
    hrList.add(getString(R.string.forms))
    hrList.add(getString(R.string.rating))

    return hrList
}
fun Context.initCallList():ArrayList<String>{
    val callList=ArrayList<String>()
    callList.add(getString(R.string.security))
     callList.add(getString(R.string.companyDoc))
     callList.add(getString(R.string.companyNurse))
     callList.add(getString(R.string.firstAider))
     callList.add(getString(R.string.engineering))
     callList.add(getString(R.string.managerOnDuty))
     callList.add(getString(R.string.emergency))

    return callList
}
fun Context.initReports():ArrayList<String>{
    val reports=ArrayList<String>()
    reports.add(getString(R.string.manager_on_duty))
    reports.add(getString(R.string.incident_report))
    reports.add("Report 3")
    reports.add("Report 4")

    return reports
}
fun Context.initManagerReports():ArrayList<String>{
    val reports=ArrayList<String>()
    reports.add("Property walk-around")
    reports.add("Room inspection")
    reports.add("Lobby standby&Guest interactions")
    reports.add("Restaurant walk-around")
    reports.add("General comments and observations/mod")
    reports.add("Guest comments")
    reports.add("Staff standard awareness")
    return reports
}
fun Context.initRooms():ArrayList<String>{
    val rooms=ArrayList<String>()
    rooms.add("Room 1")
    rooms.add("Room 2")
    rooms.add("Room 3")
    rooms.add("Room 4")
    rooms.add("Room 5")
    rooms.add("Room 6")
    rooms.add("Room 7")
    rooms.add("Room 8")
    rooms.add("Room 9")
    rooms.add("Room 10")

    return rooms
}
fun Context.initServices():ArrayList<String>{
    val services=ArrayList<String>()
    services.add("Door lock")
    services.add("Door bell")
    services.add("Card")
    services.add("Desk")
    services.add("Lamp/ceiling")
    services.add("TV")
    services.add("Quran")
    services.add("Grms")
    services.add("Reading lights")
    services.add("Bed and bedside tables")
    services.add("Telephone/clock")
    services.add("Centre table")
    services.add("Minibar/amenities")
    services.add("Coffee machine")
    services.add("Microwave")
    services.add("Hotel directory/collateral")
    services.add("Tea and coffee tray")
    services.add("Kitchenette")
    services.add("Walk in closet/blind spots")
    services.add("Safety box/instruction")
    services.add("Wash basin")
    services.add("Bathroom amenities")
    services.add("WC/flush/cleanliness")
    services.add("Toilet phone")
    services.add("Shower area")


    return services
}