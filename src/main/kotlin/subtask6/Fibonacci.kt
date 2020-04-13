package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var arr = intArrayOf(1, 1, 0)
        var tmp: Int
        while (arr[0] * arr[1] < n) {
            tmp = arr[1]
            arr[1] += arr[0]
            arr[0] = tmp
        }
        if (arr[0] * arr[1] <= n) arr[2] = 1
        return arr
    }
}
