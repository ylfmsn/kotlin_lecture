package com.suntoon.kotlin

fun main(args: Array<String>) {
    println(convert2Upercase("ab2c"))
}

fun convert2Upercase(str: Any): String? {

    if (str is String) {
        return str.toUpperCase()
    }

    return null
}

