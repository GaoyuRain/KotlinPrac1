package kotlin2

/**
 * Created by ${GY} on 2018/10/23  Kotlin1
 * GaoyuRain
 * des：接口和抽象类
 */
interface InputDevice {
}

// name 构造方法参数
abstract class Father(name: String) {
    val name = name

    abstract fun work();
    open fun eat() {
    }

}

// name 类的属性
abstract class Father1(val name: String) {
    abstract fun work();
    open fun eat() {
        println("name:$name")
    }

}

class Son(name: String) : Father(name) {

    override fun work() {

    }

    override fun eat() {
        super.eat()
    }
}

// 实例化
class Son1 : Father("hello") {
    override fun work() {

    }

}
