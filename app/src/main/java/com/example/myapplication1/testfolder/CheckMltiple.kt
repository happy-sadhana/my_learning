package com.example.myapplication1.testfolder

fun checkMultiple(num: Int) {
    if (num % 5 == 0 && num % 3 == 0) {
        println("$num is a multiple of 3 and 5")
    } else if (num % 5 == 0) {
        println("$num is a multiple of 5 ")
    } else if (num % 3 == 0) {
        println("$num is a multiple of 3")
    } else {
        println("$num is not a multiple of 3 or 5")
    }
}
fun initCheckMultiple() {
    checkMultiple(55)
}





