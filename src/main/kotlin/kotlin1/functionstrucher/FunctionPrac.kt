package kotlin1.functionstrucher

/**
 * Created by ${GY} on 2018/9/27  Kotlin1
 * GaoyuRain
 * des：函数
 */
val FINAL_WORLD = "final_world"

//匿名函数
val int2long = fun(i: Int): Long {
    return i.toLong()
}
//lanmbda表达式 返回值为最后一行的值
val sum1 = { num1: Int, num2: Int ->
    num1 + num1 + num2 + num2
    num1 + num2
    num1 + num1 + num2 + num2
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main(args: Array<String>) {
    println(sum1(2, 3))
    println(sum1)
    println(int2long)
    // 具名函数加 :: 相当于对此函数的引用
    println(::foreachTag)
    println("----------------------")
//    foreachTest(args)
    foreachTag(args)
    // lambda 表达式
}

fun foreachTest(args: Array<String>) {
    for (i in args) {
        println(i)
    }
    //参数只有一个可以用it 代替
    args.forEach { println(it) }
    // 也可以给参数起名
    args.forEach({ num -> println(num) })

    //传入的函数和参数的类型一样 可以用 ：：简化
    args.forEach(::println)

}

fun foreachTag(args: Array<String>) {
    args.forEach ForEach@{
        if (it == "j")
//            return@ForEach
            return@ForEach
        println(it)
    }
    println("the end")
}