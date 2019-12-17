package com.suntoon.kotlin

interface A {

    fun method() {
        println("A")
    }
}

open class B {
    open fun method() {
        println("B")
    }
}

/**
 * 继承的父类和实现的接口拥有同样方法，
 * 子类重写调用时需要在super后加尖括号，
 * 并在尖括号内写明
 */
class C: A, B() {
    override fun method() {
        super<A>.method()
        super<B>.method()
        println("C")
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}