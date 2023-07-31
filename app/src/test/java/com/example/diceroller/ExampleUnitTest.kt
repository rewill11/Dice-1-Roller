package com.example.diceroller

import junit.framework.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_num(){
        val dice = Dice(7)
        val rollResult = dice.roll()
        assertTrue("The string is not between 1 and 6",rollResult in 1..6)
    }
}