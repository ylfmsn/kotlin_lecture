package com.suntoon.kotlin2

// 数据类 - data class
/**
 * 数据类需要满足如下要求：
 * 1. 主构造方法至少要有一个参数
 * 2. 所有的柱构造方法参数需要被标记为var或者val
 * 3. 数据类不能是抽象的、open的、sealed的以及inner的
 *
 * 对于数据类，编译器会自动生成如下内容：
 * 1. equals/hashCode对
 * 2. toString()方法，形式为Person(name=..., age=..., address=...)
 * 3. 针对属性的componentN方法，并且是按照属性的生命顺序来生成的
 */
data class Person(val name: String, var age: Int?, var address: String?)

fun main(args: Array<String>) {
    var person = Person("zhangsan", 20, "Beijing")
    var person1 = Person("lisi", null, null)
    person1.age = 22
    person1.address = "Xi'an"
    println(person)
    println(person1)
}