package com.suntoon.kotlin

open class MyParent {
    open val name: String = "parent"
}

class MyChild: MyParent() {
    override val name: String = "child"
}

fun main(args: Array<String>) {
    var myChild = MyChild()
    println(myChild.name)
    println("------------")

    var myChild2 = MyChild2()
    println(myChild2.name)
    println("------------")

    var myChild3 = MyChild3("child3")
    println(myChild3.name)
    println("------------")

    var myChild4 = MyChild4()
    myChild4.method()
    println(myChild4.name)
}

class MyChild2(override val name: String = "child2"): MyParent() {

}

class MyChild3(override val name: String): MyParent() {
}

/**
 * 1. val 可以 override val
 * 2. var 可以 override val
 * 3. val 无法 override var
 *
 * 本质上 val相当于 get(), var相当于 get() 和 set() 方法
 */
open class MyParent3 {
    open fun method() {
        println("parent method")
    }

    open val name: String get() = "parent"
}

class MyChild4: MyParent3() {
    override fun method() {
        super.method()

        println("child method")
    }

    override val name: String get() = super.name + " and child"
}
