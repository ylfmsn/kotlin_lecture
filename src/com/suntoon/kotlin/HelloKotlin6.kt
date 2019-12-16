package com.suntoon.kotlin

fun main(args: Array<String>) {

    // 整数数组
    var array: IntArray = intArrayOf(1, 2, 3, 4)

    for (item in array) {
        println(item)
    }

    println("----------------")

    for (i: Int in array.indices) {
        println("array[$i] = ${array[i]}")
    }

    println("----------------")

    for ((index, value) in array.withIndex()) {
        println("array[$index] = $value")
    }

    println("----------------")

    // 字符串数组
    var str: Array<String> = arrayOf("abc", "def", "ghi")
    for ((index, value) in str.withIndex()) {
        println("array[$index] = $value")
    }

    println("----------------")

    // 字符数组
    var charArray: CharArray = charArrayOf('a', 'b', 'C')
    for (item in charArray) {
        println("UpserCase: ${item.toUpperCase()}, LowerCase: ${item.toLowerCase()}")
    }

    println("----------------")

    // 浮点数组
    var floatArray: FloatArray = floatArrayOf(1.1f, 2.2f, 3.3f)
    for (i in floatArray.indices) {
        println("floatArray[$i] = ${floatArray[i]}")
    }
}