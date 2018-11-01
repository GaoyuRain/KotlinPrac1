package kotlin2

/**
 * Created by ${GY} on 2018/11/1  Kotlin1
 * GaoyuRain
 * des：接口代理
 */
interface Driver {
    fun drive()
}

interface Writer {
    fun write()
}

class CarDriver : Driver {
    //模块内可见 同一个模块 java没有对应的关键字
    internal val name: String = "aaa"
    protected val name1: String = "aaa"
    private val name2: String = "aaa"
    public val name3: String = "aaa"


    override fun drive() {
        println("开小轿车")
    }
}

class PPTWriter : Writer {
    override fun write() {
        println("写ppt")
    }
}

//高级经理 主要是 by 关键字 driver
class SensorManger(driver: Driver, val writer: Writer) : Driver by driver, Writer by writer


fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val sensorManger = SensorManger(driver, writer = writer)
    sensorManger.drive()
    sensorManger.write()
}