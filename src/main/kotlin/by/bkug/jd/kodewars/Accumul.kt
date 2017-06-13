package by.bkug.jd.kodewars

/**
 * This time no story, no theory. The examples below show you how to write function accum:
 * Examples:
 *
 * Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
 * Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
fun accum(s: String): String {
    val arr = s.toCharArray()
    var str = ""

    for (i in arr.indices) {
        str += arr[i].toString().decapitalize().repeat(i + 1).capitalize().plus("-")
    }
    return str.dropLast(1)
}