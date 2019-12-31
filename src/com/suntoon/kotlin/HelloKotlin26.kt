package com.suntoon.kotlin

// 扩展的作用域
/**
 * 1. 扩展函数所定义在的类实例叫做分发接受者（dispatch receiver），拓展函数在哪个类中定义
 * 2. 扩展函数所扩展的那个类的实例叫做扩展接受者（extension receiver），扩展函数是扩展哪个类的
 * 3. 当以上两个名字出现冲突时，扩展接受者的优先级最高
 */
class DD {
    fun method() {
        println("DD method")
    }
}

class EE {
    fun method2() {

    }

    fun DD.hello() {
        method()
        method2()
    }

    fun word(dd: DD) {
        dd.method()
    }

    fun DD.output() {
        println(toString())  // 调用的是DD的toString方法，扩展接受者优先级高
        println(this@EE.toString())
    }

    fun test() {
        var dd = DD()
        dd.output()
    }
}

fun main(args: Array<String>) {
    // DD().hello()       // 扩展函数只能在分发接受者中使用，作用域只能是分发接受者
    EE().test()
}

// 扩展可以很好地解决Java中充斥的各种辅助类问题