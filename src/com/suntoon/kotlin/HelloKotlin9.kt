package com.suntoon.kotlin

fun main(args: Array<String>) {

    var array = listOf<String>("hello", "world", "hello world", "goodbye", "welcome")

    for (item in array) {
        println(item)
    }

    println("-------")

    if ("world" in array) {
        println("world in collection")
    }

    println("-------")

    when {
        "world" in array -> println("world in collection")
    }

    println("-------")

    // 找出集合中长度大于五，然后转大写，之后打印
    array.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }











}
