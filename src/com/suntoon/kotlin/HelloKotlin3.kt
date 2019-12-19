package com.suntoon.kotlin

fun main(args: Array<String>) {
    var x = 10
    var y = 20

    var max: Int
    var min: Int

    /*if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }
    println("max: $max, min: $min")*/

    max = if (x > y) {
        println("x > y")
        x
    } else {
        println("x < y")
        y
    }

    min = if (x < y) {
        println("x < y")
        x
    } else {
        println("x > y")
        y
    }

    println("max: $max, min: $min")

}