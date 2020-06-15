package me.camdenorrb.kotlinbugs

object Thing1 {

    @JvmStatic
    fun main(args: Array<String>) {
        com.boydti.fawe.FaweAPI.getMaskManagers()
    }

}