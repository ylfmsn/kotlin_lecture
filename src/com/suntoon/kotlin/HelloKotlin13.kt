package com.suntoon.kotlin

// 类属性初始化另一种方式
class Student (private val username: String, private val age: Int, private var address: String) {

    fun printInfo() {
        println("username: $username, age: $age, address: $address")
    }
}

/**
 * 如果构造方法拥有注解或是可见性修饰符，
 * 那么constructor关键字是不能省略的，
 * 并且它位于修饰符后面
 */
class Student2 private constructor(username: String) {

}

/**
 * 构造方法设置默认值
 * 在JVM上，如果类的primary构造方法的所有参数都拥有默认值，那么kotlin编译器就会为这个类生成一个不带参数的构造方法，
 * 这个不带参数的构造方法会使用这些参数的默认值，这样做的目的在于可以跟Spring等框架更好的集成
 */
class Student3 (val username: String = "zhangsan") {

}

fun main(args: Array<String>) {
    var student = Student("liruipeng", 33, "WeiNan")
    student.printInfo()
}