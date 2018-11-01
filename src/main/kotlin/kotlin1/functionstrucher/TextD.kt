package kotlin1.functionstrucher

/**
 * Created by ${GY} on 2018/10/22  Kotlin1
 * GaoyuRain
 * des：循环语句  参数
 */
fun main(args: Array<String>) {
    //坐标 和 值
    for ((index, value) in args.withIndex()) {
        println("$index -> $value")
    }
    for (indexValue in args.withIndex()) {
        println("${indexValue.index} -> ${indexValue.value}")
    }

    //具名参数
    realNameParams(age = "18", name = "rain")

    println("----------------------------------------------------------")
    //变长参数 *表示展开数组
    longParams(1, 2, 3, string = "rain")
    val intArray = intArrayOf(2, 2, 3)
    longParams(*intArray, string = "rain")

    println("----------------------------------------------------------")
    // &   默认参数
    defaultParams(ints = *intArray, string = "rain")


}

fun realNameParams(name: String, age: String) {
    println("name:$name,age:$age")
}

fun longParams(vararg ints: Int, string: String) {
    ints.forEach(::println)
    println(string)
}

fun defaultParams(double: Double = 3.0, vararg ints: Int, string: String) {
    println(double)
    ints.forEach(::println)
    println(string)
}