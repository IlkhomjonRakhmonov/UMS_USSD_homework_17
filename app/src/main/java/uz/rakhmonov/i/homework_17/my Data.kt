package uz.rakhmonov.i.homework_17

import uz.rakhmonov.i.homework_17.models.myTemplate
import uz.rakhmonov.i.homework_17.myData.listDaqiqa
import uz.rakhmonov.i.homework_17.myData.listInternet
import uz.rakhmonov.i.homework_17.myData.listSMS
import uz.rakhmonov.i.homework_17.myData.listTarif
import uz.rakhmonov.i.homework_17.myData.listXizmat

object `myData` {
    var listTarif=ArrayList<myTemplate>()
    var listDaqiqa=ArrayList<myTemplate>()
    var listInternet=ArrayList<myTemplate>()
    var listXizmat=ArrayList<myTemplate>()
    var listSMS=ArrayList<myTemplate>()
}
fun loadData(){
    listTarif.clear()
    listDaqiqa.clear()
    listInternet.clear()
    listXizmat.clear()
    listSMS.clear()
     listTarif.add(myTemplate("Mobi 100","*111*1#", "25000 so'm","Bir oyga"))
     listTarif.add(myTemplate("Mobi 110","*111*2#", "35000 so'm","Uch oyga"))
     listTarif.add(myTemplate("Mobi 150","*111*3#", "45000 so'm","Olti oyga"))
     listTarif.add(myTemplate("Mobi 200","*111*4#", "55000 so'm","Cheksiz"))

     listDaqiqa.add(myTemplate("20 daqiqa","*111*6#", "15000 so'm","30 kunga"))
     listDaqiqa.add(myTemplate("30 daqiqa","*111*7#", "25000 so'm","30 kunga"))
     listDaqiqa.add(myTemplate("40 daqiqa","*111*8#", "35000 so'm","30 kunga"))
     listDaqiqa.add(myTemplate("50 daqiqa","*111*9#", "45000 so'm","30 kunga"))

     listInternet.add(myTemplate("10 GB","*111*2*5#", "20000 so'm","30 kunga"))
     listInternet.add(myTemplate("20 GB","*111*3*5#", "30000 so'm","30 kunga"))
     listInternet.add(myTemplate("30 GB","*111*4*5#", "40000 so'm","30 kunga"))
     listInternet.add(myTemplate("40 GB","*111*4*5#", "50000 so'm","30 kunga"))

    listXizmat.add(myTemplate("Gap yo'q","*111*9*8#", "20000 so'm","30 kunga"))
    listXizmat.add(myTemplate("Gap yo'q PRO","*111*8*8#", "30000 so'm","30 kunga"))
    listXizmat.add(myTemplate("Omad","*111*7*8#", "40000 so'm","30 kunga"))
    listXizmat.add(myTemplate("Omad Plus","*111*6*8#", "50000 so'm","30 kunga"))

    listSMS.add(myTemplate("500 ta","*111*6*1#", "5000 so'm","30 kunga"))
    listSMS.add(myTemplate("700 ta","*111*6*2#", "10000 so'm","30 kunga"))
    listSMS.add(myTemplate("900 ta","*111*6*3#", "15000 so'm","30 kunga"))
    listSMS.add(myTemplate("1000 ta ","*111*6*4#", "20000 so'm","30 kunga"))


}

