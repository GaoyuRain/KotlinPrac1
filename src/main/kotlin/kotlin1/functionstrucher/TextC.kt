package kotlin1.functionstrucher

/**
 * Created by ${GY} on 2018/10/18  Kotlin1
 * GaoyuRain
 * des：中缀表达式(in on)， 分支表达式， when表达式
 */
class TextC {

    infix fun on(objects: Any): Boolean {
        return false
    }
}

private const val username = "kotlin"
private const val passeword = "123456"


fun main(args: Array<String>) {
    val b = TextC()
    val c = TextC()
    println(b on c)
    println("请输入用户名：")
    var name = readLine()
    println("请输入密码")
    var pwd = readLine()
    // if 分支返回语句 返回值为最后一行
    val mode = if (name == username && pwd == passeword) {
        println("登录成功")
        true
    } else {
        println("登录失败")
        false
    }
    println("mode=$mode")

    //when 表达式
    val d = "a"
    when (d) {
        //可以代替switch
        "a", "b", "c" -> println("a=true")
        "d" -> println("a=d")
        else -> println("a=false")
    }
    val e = 200
    //可以代替if 分支的返回值为最后一句
    val f = when {
        e > 100 -> {
            println("$e 大于100")
            0
        }
        else -> 1
    }
    //其他用法
    when (e) {
        in 0..100 -> println("$e is in 0..100")
//        !in 0..100 -> println("$e is not in 0..100")
//        is Int -> println("$e is Int")
        else -> println("0")
    }

}