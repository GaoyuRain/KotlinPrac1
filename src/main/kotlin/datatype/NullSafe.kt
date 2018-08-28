package datatype

import Child
import Parent

/**
 * Created by ${GY} on 2018/8/22  Kotlin1
 * GaoyuRain
 * des：空类型和智能类型转换
 */
fun getName(): String {
    return "xiaowang"
}

//加上?表示可返回null
fun getName1(): String? {
    return null
}

fun main(args: Array<String>) {
//    if (datatype.getName()== null)
    println(getName().length)

    //！！表示已经确定值不为null
    val age: String? = "18"
    println("age:${age!!.length}:")

    val name = getName1()
    //如果不为null 则打印长度
    println(name?.length)
    //如果为null return
//    name ?: return

    //智能类型转换
    val weight: String? = "18"
    if (weight is String) {
        println("age:${weight.length}:")
    }
    val child: Parent = Child()
    if (child is Child)
        println(child.name)
    // parent 强转为Child ，如果失败返回null 避免抛异常
    val parent: Parent = Parent()
    val child1: Child? = parent as? Child
    println("child1:$child1")
}