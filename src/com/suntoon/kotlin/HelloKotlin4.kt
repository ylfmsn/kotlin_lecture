package com.suntoon.kotlin

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(convert2Int("2"))
    println(convert2Int("abc"))

    println(printMultiply("2", "6"))

    println(printMultiply2("a", "5"))
}

fun convert2Int(str: String): Int? {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        println("param not int")
        return null
    }
}

fun printMultiply(a: String, b: String): Int? {
    var a2Int = convert2Int(a)
    var b2Int = convert2Int(b)

    return if (a2Int != null && b2Int != null) {
        a2Int * b2Int
    } else {
        null
    }
}

fun printMultiply2(a: String, b: String): Int? {
    var a2Int = convert2Int(a)
    var b2Int = convert2Int(b)
    return if (a2Int == null) {
        println("param is null")
        null
    } else if (b2Int == null) {
        println("param is null")
        null
    } else {
        return a2Int * b2Int
    }
}

