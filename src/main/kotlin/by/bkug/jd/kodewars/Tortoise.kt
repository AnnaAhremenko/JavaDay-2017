package by.bkug.jd.kodewars

/**
 * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour.
 * Young B knows she runs faster than A and furthermore has not finished her cabbage.
 *
 * When she starts, at last, she can see that A has a 70 feet lead but B speed is 850 feet per hour.
 * How long will it take B to catch A?
 *
 * More generally: given two speeds v1 (A speed, integer > 0) and v2 (B speed, integer > 0)
 * and a lead g (integer > 0) how long will it take B to catch A?
 *
 * The result will be an array [h, mn, s] where h, mn, s is the time needed in hours, minutes
 * and seconds (don't worry for fractions of second). If v1 >= v2 then return null.
 *
 * Examples:
 *
 * race(720, 850, 70) => [0, 32, 18]
 * race(80, 91, 37) => [3, 21, 49]
 */
fun race(v1: Int, v2: Int, g: Int): IntArray {
    if (v2 > v1) {
        val time = g / (v2 - v1).toFloat()
        return intArrayOf(time.toInt(), (time * 60).toInt() - time.toInt() * 60, (time * 3600).toInt() - (time * 60).toInt() * 60)
    } else {
        return null!!
    }
}