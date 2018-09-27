package datatype

import datatype.company.Boss

/**
 * Created by ${GY} on 2018/8/28  Kotlin1
 * GaoyuRain
 * des：数组
 */
val arrayOfInt: IntArray = intArrayOf(1, 3, 4, 5)
val arrayOfChar: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')
val arrayOfString: Array<String> = arrayOf("hello", "world")
val arrayOfBoss: Array<Boss> = arrayOf(Boss("rain"), Boss("li"), Boss("ff"))

fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
        println(int)
    }
    println(arrayOfBoss[0])
    arrayOfBoss[0] = Boss("Gao")
    println(arrayOfBoss[0])

    // 字符间加 ，
    println(arrayOfChar.joinToString())
    // 字符间为空
    println(arrayOfChar.joinToString(""))
    //打印  切片 范围
    println(arrayOfInt.slice(1..2))
}