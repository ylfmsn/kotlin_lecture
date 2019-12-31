package com.suntoon.kotlin

/**
 * 伴生对象扩展方法
 */
class CompanionObjectExtension {
    companion object MyObject {

    }
}

fun CompanionObjectExtension.MyObject.method() {
    println("hello world")
}

fun main(args: Array<String>) {
    CompanionObjectExtension.method()
}