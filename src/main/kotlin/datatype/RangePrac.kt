package datatype

/**
 * Created by ${GY} on 2018/8/23  Kotlin1
 * GaoyuRain
 * des：区间
 */

val range: IntRange = 0..20 //[0-20]
val range_exclusive: IntRange = 0 until 20 //[0-20)
val emtyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emtyRange.isEmpty())
    println(range.contains(5))
    println(5 in range)
    for (i in range) {
        println("i:$i")
    }
}
