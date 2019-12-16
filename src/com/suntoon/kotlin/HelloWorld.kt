package com.suntoon.kotlin

fun main(args: Array<String>) {
    /*println("Hello World!")

    println("----------")

    var list: List<String> = listOf("hello", "world", "hello world")

    for (str in list) {
        println(str)
    }

    println("----------")
    list.forEach(Consumer { println(it) })

    println("----------")
    list.forEach(System.out::println)*/

    println(sum(1, 2))

    println(sum2(2, 3))

    myPrint(3, 4)

    myPrint2(4, 5)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun myPrint(a: Int, b: Int) {
    println(a + b)
}

fun myPrint2(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

