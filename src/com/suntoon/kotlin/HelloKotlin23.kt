package com.suntoon.kotlin

/**
 * Kotlin支持 扩展，为了给类添加功能
 *
 * 扩展函数的解析是静态的
 *
 * 1. 扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或是方法
 * 2. 扩展函数的分析时静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
 * 3. 调用是由对象类型所决定的，而不是由对象的实际类型决定
 */
class TheExtension {

    val name: String = "liruipeng"

    fun say() {
        println("say hello")
    }

    fun eat() {
        println("eat noodle")
        println(name)
    }
}

fun TheExtension.walk() {
    println("walking ...")
    println(name)
}

fun main(args: Array<String>) {
    var theExtension = TheExtension()
    theExtension.walk()

    CC().foo()
}

class CC {
    fun foo() {
        println("member")
    }
}

fun CC.foo() {
    println("member2")
}
