package com.suntoon.kotlin

/**
 * Kotlin的可见性 visibility 修饰符有四个： public , private , internal, protected
 * 如果不写可见性修饰符，则默认public
 * public 表示所有都能访问的
 * private 表示在该类中可以被访问的
 * internal 表示在同一个模块下module中可以被访问的
 * protected 表示类或者子类中使用，不能用在顶层函数(如下面的方法a())或顶层类(如下面的类Clazz或者SubClazz)中，在包下直接写方法或者类
 */
fun a() {

}

open class Clazz {
    private var name: String = "Zhang San"

    internal var age: Int = 20

    protected var sex: Boolean = true

    fun myPrint22() {
        println(name)
    }
}

class SubClazz: Clazz() {
    fun print() {
        println(sex)
    }
}

fun main(args: Array<String>) {
    var clazz = Clazz()
    // println(clazz.name)   name是private的所以只能在Clazz中被访问
    clazz.myPrint22()

    println(clazz.age)

    var subClazz = SubClazz()
    subClazz.print()
}