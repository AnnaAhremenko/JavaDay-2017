package by.bkug.jd.kodewars

/**
 * In this kata you have to write a method that folds a given array of integers by the middle x-times.
 *
 * An example says more than thousand words:
 *
 * Fold 1-times:
 * [1,2,3,4,5] -> [6,6,3]
 *
 * A little visualization (NOT for the algorithm but for the idea of folding):
 *
 * Step 1 Step 2 Step 3 Step 4 Step5
 * 5/ 5| 5\
 * 4/ 4| 4\
 * 1 2 3 4 5 1 2 3/ 1 2 3| 1 2 3\ 6 6 3
 * —--*--— —--* —--* —--* —--*
 *
 * Fold 2-times:
 * [1,2,3,4,5] -> [9,6]
 *
 * As you see, if the count of numbers is odd, the middle number will stay.
 * Otherwise the fold-point is between the middle-numbers, so all numbers would be added in a way.
 *
 * The array will always contain numbers and will never be null.
 * The parameter runs will always be a positive integer greater than 0
 * and says how many runs of folding your method has to do.
 * If an array with one element is folded, it stays as the same array.
 *
 * The input array should not be modified!
 */
fun foldArray(array: IntArray, runs: Int): IntArray {
    val ress = array.toMutableList()
    val res : MutableList<Int> = arrayListOf()

    for (i in 0..runs-1){
        val ind = ress.size%2
        for (j in 0..ress.size / 2 - 1 ) {
            res.add(j, ress[j] + ress[ress.lastIndex-j])
        }
        if (ind != 0) {
            res.add(ress.size / 2, ress[ress.size / 2])
        }
        ress.clear()
        ress.addAll(res)
        res.clear()
    }

    return ress.toIntArray()
}