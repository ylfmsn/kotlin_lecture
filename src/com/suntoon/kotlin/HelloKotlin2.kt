package com.suntoon.kotlin

import com.suntoon.kotlin.multiply as mymultiply

fun main(args: Array<String>) {
    val a: Int = 1      // val 定义常量 不可修改
    val b = 2

    var c: Int
    c = 3

    var d = 3
    d = 4

    println(d)

    var x = 10
    var y: Byte = 20

    x = y.toInt()
    println(x)

    println(mymultiply(4, 5))
}