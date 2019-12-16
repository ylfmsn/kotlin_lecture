package com.suntoon.kotlin

class Person constructor(username: String) {

    private var username: String
    private var age: Int
    private var address: String

    init {
        //println(username)
        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    // secondary构造方法必须要直接或者间接的去调用他的primary构造方法
    constructor(username: String, age: Int): this(username) {
        //println("$username, $age")
        this.username = username
        this.age = age
        this.address = "hangzhou"
    }

    constructor(username: String, age: Int, address: String): this(username, age) {
        this.address = address
    }

    fun printInfo() {
        println("$username, $age, $address")
    }
}

fun main(args: Array<String>) {
    var person = Person("liruipeng")
    var person1 = Person("chenzhuoying", 30)
    var person2 = Person("wangyuan", 27, "xi'an")

    person.printInfo()   // liruipeng 20 beijing
    person1.printInfo()  // chenzhuoying  30  hangzhou
    person2.printInfo()  // wangyuan  27  xi'an
}