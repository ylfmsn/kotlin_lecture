package com.suntoon.kotlin2

import kotlin.test.assertTrue

// 在Kotlin中： Consumer in --逆变, Producer out --协变

class ParameterizedClass<A>(private val value: A) {
    fun getValue(): A {
        return this.value
    }
}

class ParameterizedProducer<out T>(private val value: T) {
    fun get(): T {
        return this.value
    }
}

class ParameterizedConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main(args: Array<String>) {
    val parameterizedClass = ParameterizedClass<String>("hello world")
    var result = parameterizedClass.getValue()

    assertTrue (result is String)

    println("----------")

    val parameterProducer = ParameterizedProducer("welcome")
    val myRef: ParameterizedProducer<Any> = parameterProducer

    assertTrue(myRef is ParameterizedProducer<Any>)

    println("----------")

    val parameterizedConsumer = ParameterizedConsumer<Number>()
    val myRef2: ParameterizedConsumer<Int> = parameterizedConsumer

    assertTrue(myRef2 is ParameterizedConsumer<Int>)
}