package com.suntoon.kotlin

class EmptyClass

// 在Kotlin中，一个类可以有一个primary构造方法以及一个或多个secondary构造方法
// primary构造方法是类头（class header）的一部分，它位于类名后面，可以拥有若干参数

// 如果primary构造方法没有任何注解或是可见性关键字修饰，那么constructor关键字可省略
// init 是初始化代码块，作用给类属性赋值，可以直接用类传入的参数

class MyClass (username: String) {
    private val username: String = username.toUpperCase()

    init {
        println(username)
    }

    fun myPrint(str: String) {
        println(str)
    }
}

fun main(args: Array<String>) {
    // 实例化
    var myClass = MyClass("zhangsan")

    myClass.myPrint("lisi")
}