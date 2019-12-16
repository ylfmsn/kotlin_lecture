package com.suntoon.kotlin

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println("--------")
    println(myPrint2("test"))
    println("--------")
    var a = 6
    var result = when (a) {
        1 -> {
            println("a = 1")
            10
        }
        2 -> {
            println("a = 2")
            20
        }
        in 3..7 -> {
            println("range in 3-7")
            30
        }
        8, 9, 10 -> {
            println("a = 8 or 9 or 10")
            40
        }
        else -> {
            println("out of range")
            11
        }
    }
    println(result)
}

fun myPrint(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun myPrint2(str: String): String = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    else -> "other input"
}

