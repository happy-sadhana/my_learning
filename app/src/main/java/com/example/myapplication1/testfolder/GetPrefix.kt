package com.example.myapplication1.testfolder

fun getPrefix() {

    println("test")
    printPrefix(listOf("apple", "application", "appointment"))
    printPrefix(listOf("abcde","abcdxy","abcdmno","abcdfgh" ))

}


private fun printPrefix(wordList:List<String>){
    var prefix = ""
    sampu@ for(g in 0..wordList[0].length-1) {
        for(i in 1..wordList.size-1) {
            if(wordList[0].get(g) == wordList[i].get(g)) {
                if(i == wordList.size -1 ){
                    prefix = prefix + wordList[0][g]
                }
            } else {
                break@sampu
            }
        }
    }
    println(prefix)

}




