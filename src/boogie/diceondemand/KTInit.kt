package boogie.diceondemand

import java.util.*

class KTInit {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            UIController()
        }
    }

    fun randomnumber(num: Int): Int {
        val rand: Random = Random()
        return rand.nextInt(num + 1)
    }
}