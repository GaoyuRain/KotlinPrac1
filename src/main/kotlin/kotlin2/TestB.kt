package kotlin2

/**
 * Created by ${GY} on 2018/11/1  Kotlin1
 * GaoyuRain
 * des：单例
 */

interface onDriverListener {
    fun onMount(driver: CarDriver)
}

abstract class Player

object MusicePlayer : Player(), onDriverListener {
    override fun onMount(driver: CarDriver) {
    }

}

fun main(args: Array<String>) {
    val player = MusicePlayer
}