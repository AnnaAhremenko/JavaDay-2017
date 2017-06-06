package by.bkug.jd.kodewars

/**
 * You have a sequence of positive numbers starting with 1, but one number is missing!
 * Find out the missing number; if the sequence is not broken, you should return 0.
 * Each sequence always increments by 1.
 *
 * In short: an invalid sequence (a string with non numeric character) must return 1,
 * an already complete (or empty) sequence must return 0;
 * a broken sequence with more than one number missing should return the lowest missing number;
 * otherwise return the missing number.
 *
 * Note that the input may be with random order.
 *
 * E.g.
 * BrokenSequence().findMissingNumber("1 3 2 5") // returns 4, because 4 is missing
 * BrokenSequence().findMissingNumber("1 2 3 4") // returns 0, because the sequence isn't broken
 * BrokenSequence().findMissingNumber("1 5") // returns 2, because the sequence is missing more than
 * one number and 2 is the lowest between 2, 3 and 4
 * BrokenSequence().findMissingNumber("2 1 4 3 a") // returns 1, because it's an invalid sequence.
 * in this case, it's invalid because contain a non numerical character
 */
fun findMissingNumber(s: String): Long {
    //TODO("3 Points")
    var res : Long = 0
    var arr = s.replace(" ", "").toCharArray().sortedArray()

    if(arr.isNotEmpty()) {
        for (i in 0..arr.size - 1) {
            if (arr[i].isLetter()) {
                res = 1
                break
            }
        }
        if (res != 1.toLong()) {
            for (i in 0..arr.size - 1) {
                if (arr[i + 1] - arr[i] >= 2) {
                    res = arr[i].toInt().toLong() - 47
                    break
                }
            }
        }
    }

    println(res)
    return res
}

fun main(args: Array<String>) {
    findMissingNumber("1 3 2 4 6")
}