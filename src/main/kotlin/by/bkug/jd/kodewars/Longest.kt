package by.bkug.jd.kodewars

/**
 * Description:
 * Take 2 strings s1 and s2 including only letters from a to z.
 * Return a new sorted string, the longest possible, containing distinct letters,
 * - each taken only once - coming from s1 or s2.
 *
 * Examples:
 *
 * a = "xyaabbbccccdefww"
 * b = "xxxxyyyyabklmopq"
 * longest(a, b) -> "abcdefklmopqwxy"
 *
 * a = "abcdefghijklmnopqrstuvwxyz"
 * longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
 */
fun longest(s1: String, s2: String): String {
    var result = s1.toCharArray() + s2.toCharArray()
    result.sort()
    var res = result.distinct()
    var str = ""

    for(i in 0..res.size-1) {
        str += res[i]
    }
    return str
    //TODO("1 Point")
}