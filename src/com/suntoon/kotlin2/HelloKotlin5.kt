package com.suntoon.kotlin2

/*
     Kotlin: 声明处协变； Java： 使用处协变

     Kotlin中out关键字叫做variance annotation，因为它是在类型参数声明处所指定的，因此我们
     称之为声明处协变（declaration-side variance）。

     对于Java来说则是使用处协变（use-side variance），其中类型通配符使得类型协变变成为可能。
 */

/*
    如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out

    producer = output = out
 */
interface Producer<out T> {
    fun produce(): T
}

/*
    如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in

    consumer = input = in
 */
interface Consumer<in T> {
    fun consumer(item: T)
}

/*
    如果泛型类同时将泛型类型作为其方法的输出类型和输入类型，那么我们就不能使用out和in来修饰泛型
 */
interface ProducerConsumer<T> {
    fun producer(): T

    fun consumer(item: T)
}