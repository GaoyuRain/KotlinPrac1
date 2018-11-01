package kotlin1.functionstrucher

/**
 * Created by ${GY} on 2018/10/18  Kotlin1
 * GaoyuRain
 * des：自定义运算符 能定义的运算符只有部分
 */
class TextB(var real: Int, var noReal: Int) {

    /**
     * 自定义加号运算符 参数只能有一个
     */
    operator fun plus(other: TextB): TextB {
        return TextB(other.real + real, other.noReal + noReal);
    }

    operator fun plus(num: Int): TextB {
        return TextB(real + num, noReal + num)
    }

    operator fun minus(num: Int): Int {
        return real + noReal - num
    }

    override fun toString(): String {
        return "$real+$noReal"
    }
}

fun main(args: Array<String>) {
    var b = TextB(2, 3)
    var c = TextB(2, 3)
    println(b + c)
    println(b + 3)
    println(c - 1)
    "" in args
}