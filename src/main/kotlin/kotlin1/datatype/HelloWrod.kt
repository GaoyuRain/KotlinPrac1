package kotlin1.datatype

/**
 * Created by ${GY} on 2018/8/21  Kotlin1
 * GaoyuRain
 * des：数据类型
 */
val aint: Int = Int.MAX_VALUE
val string1: String = "aa"
val string2: String = String(charArrayOf('a', 'a'))
const val int1: Int = 1
const val int2: Int = 2

fun main(args: Array<String>) {
    println("hello word")
    println(aint)
    println(string1 == string2)
    println(string1 === string2)

    println("$int1+$int2=${int1 + int2}")
}