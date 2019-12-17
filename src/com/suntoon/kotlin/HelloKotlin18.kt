package com.suntoon.kotlin

open class BaseClass {
    open fun method() {

    }
}

abstract class ChildClass: BaseClass() {
    override abstract fun method()
}