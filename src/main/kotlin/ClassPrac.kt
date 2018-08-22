/**
 * Created by ${GY} on 2018/8/21  Kotlin1
 * GaoyuRain
 * des：
 */
//所有类都继承自Any
open class Person(name: String, age: Int, weight: Int) {
    init {
        println("new 了一个${this.javaClass.simpleName},name:$name,age$age,wetght$weight")
    }
}

class Girle(name: String, age: Int, weight: Int) : Person(name, age, weight)
class Boy(name: String, age: Int, weight: Int) : Person(name, age, weight)

fun main(args: Array<String>) {
    val xiaoLi: Girle = Girle("小丽", 22, 99)
    val xiaoWang: Boy = Boy("小王", 22, 98)
    println(xiaoLi is Person)
}