package kotlin1.functionstrucher

/**
 * Created by ${GY} on 2018/10/18  Kotlin1
 * GaoyuRain
 * des：延迟加载
 */
class TestA {
    public var a = 0
    var b: String = ""
    var c: Boolean = false
    lateinit var d: String
    //延迟加载 调用的时候加载
    val e: String by lazy {
        "eee"
    }

    /* get() {
         return field
     }*/
}

fun main(args: Array<String>) {
    println("start")
    val a = TestA()
    println("init a end")
    println(a.c)
    println(a.e)
}

