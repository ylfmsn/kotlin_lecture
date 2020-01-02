package com.suntoon.kotlin2

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer

// 泛型（generics），表示变量类型的参数化

class MyGeneric<T>(t: T) {
    var variable: T

    init {
        this.variable = t
    }
}

fun main(args: Array<String>) {
    //var myGeneric: MyGeneric<String> = MyGeneric<String>("helloworld")
    var myGeneric = MyGeneric("helloworld")     // 借助于kotlin的类型推断
    println(myGeneric.variable)

    println("----------")
    var myClass = MyClass<String, Number>("abc", 2.2)
    myTest(myClass)
}

// 协变（covariant） 与 逆变（controvariant）
/**
   List<Object>
   List<String>
   List<String> list = new ArrayList();
   List<Object> list2 = list;    // 编译失败

   list2.add(new Date())

   String str = list.get(0);

   List<? extends Object> list ...

   interface Collection<E> {
        void addAll(Collection<E> items);
   }

   void copyAll(Collection<Object> to, Collection<String> from) {
        to.addAll(from);
   }

   interface Collection<E> {
        void addAll(Collection<? extends E> items);     // 可以将E及子类类型的集合添加到E类型的集合中
   }

   Collection<String> 就是 Collection<? extends Object>的子类型（Collection<String>绝不是Collection<Object>的子类）。  kotlin out --协变
   List<? super String>  kotlin in  --逆变

    我们如果只从中读取数据，而不往里面写入内容，那么这样的对象叫做生产者；如果只往里面写入数据，而不从里面读取数据，那么这样的数据叫做消费者。
    java里面 生产者使用 ? extends E； 消费者使用 ? super E
    kotlin里面生产者使用 out； 消费者 in
 */
class MyClass<out T, in M>(t: T, m: M) {
    private var t: T

    private var m: M

    init {
        this.t = t
        this.m = m
    }

    fun get(): T {
        return this.t
    }

    fun set(m: M) {
        this.m = m
    }
}

fun myTest(myClass: MyClass<String, Number>) {
    var myObject: MyClass<Any, Int> = myClass     // java里面类似于 var myObject: MyClass<? extends Any, ? super Int> = myClass
    println(myObject.get())
}