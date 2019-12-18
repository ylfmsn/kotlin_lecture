package com.suntoon.kotlin

/**
 * 属性设置
 *
 * var propertyName: propertyType = initializer
 *     getter()...
 *     setter()...
 *
 * backing field，支撑字段（域），field
 * backing property，支撑属性，类中声明一个private属性，在类外不能访问，只能在类中的方法中访问，通过方法来方法之前的private属性
 */
class ThePerson (address: String, name: String) {
    val age: Int
        get() = 20

    var address: String = address
        get() {
            println("get invoked")
            return field     // 支撑字段（域名）
        }
        set(value) {
            println("set invoked")
            field = value     // 支撑字段（域名）
        }
    private var name: String = name
        private set
        private get

    fun readName() = name
}

fun main(args: Array<String>) {
    var person = ThePerson("beijing", "lisi")
    println(person.age)
    println(person.address)
    person.address = "Xi'an"
    println(person.address)

    // println(person.name)  部分能访问 因为在类中是private
    println(person.readName())    // 支撑属性
}