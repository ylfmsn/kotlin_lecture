package com.suntoon.kotlin2

/**
 * 密封类（sealed class），密封类是抽象类
 * 1. 用于表示一种受限的类的层次结构，就是父类与子类的概念，对于密封类中的数值的类型，只能是受限的几种类型之一，而不能成为其他类型
 * 2. 密封类是可以有子类的，密封类的子类可以创建无限多个实例
 * 3. 要想声明一个密封类，在类的修饰符前加上sealed关键字就可以了
 * 4. 密封类是可以有子类的，从kotlin1.1版本起要求密封类与子类必须定义到同一个文件里面，而1.1之前要求子类定义到密封类的内部
 * 5. 密封类本身是一个抽象类，因此密封类是不能被实例化的，而密封类本身包含有抽象成员，同时，密封类不允许提供非私有的构造方法，换句话说，密封类的构造方法默认情况下是私有的
 */

sealed class Calcultor

class Add: Calcultor()

class Subtract: Calcultor()

fun calculate(a: Int, b: Int, cal: Calcultor) = when(cal) {
    is Add -> a + b
    is Subtract -> a - b
}

fun main(args: Array<String>) {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
}

