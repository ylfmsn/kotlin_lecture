package com.suntoon.kotlin

/**
 * 如果父类中的方法要被子类重写，
 * 那么父类该方法前需要加上open关键字来表示该方法可被重写
 */
open class Fruit {
    open fun name() {
        println("Fruit")
    }

    fun expirationDate() {
        println("1 month")
    }
}

/**
 * 如果子类重写了父类的方法，那么子类的该方法前必须加上override关键字
 */
class Apple: Fruit() {
    override fun name() {
        println("Apple")
    }
}

/**
 * Orange类中name方法重写了Fruit中的name方法，
 * 该方法前加上final关键字，
 * 在继承Orange类的子类则无法重写name方法
 */
open class Orange: Fruit() {
    final override fun name() {
        println("orange")
    }
}

fun main(args: Array<String>) {
    var apple = Apple()
    apple.name()
    apple.expirationDate()
}