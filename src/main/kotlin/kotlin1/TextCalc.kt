package kotlin1

/**
 * Created by ${GY} on 2018/10/23  Kotlin1
 * GaoyuRain
 * des：命令行计数器
 */
fun main(args: Array<String>) {
    while (true) {
        try {
            println("请输入运算式 例如： 3 + 4")
            val input = readLine() ?: break
            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("$arg1$op$arg2=${Operator(op).apply(arg1, arg2)}")
            println("$arg1$op$arg2=${Operator(op).opFun1(arg1, arg2)}")
        } catch (e: Exception) {
            println("输入表达式有误")
        }
        println("是否继续？[y]")
        val isGoOn = readLine()
        if (isGoOn == null || !isGoOn.toLowerCase().equals("y"))
            break
    }

}

class Operator(op: String) {
    // 未初始化
    val opFun: (left: Double, right: Double) -> Double

    //直接初始化
    val opFun1 = { left: Double, right: Double ->
        when (op) {
            "+" -> left + right
            "-" -> left - right
            "*" -> left * right
            "/" -> left / right
            else ->
                throw UnsupportedOperationException(op)

        }
    }

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            else ->
                throw UnsupportedOperationException(op)

        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}