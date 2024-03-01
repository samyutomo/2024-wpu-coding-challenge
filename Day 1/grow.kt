// WPU Coding Challenge 2024
// 1/366
// https://www.codewars.com/kata/57f780909f7e8e3183000078

fun main() {
    print(grow(intArrayOf(1, 2, 3, 4)))
}

// This solution multiplies array collection one by one with for loop method and accumulates the calculation in a variable of result.
fun grow(arr: IntArray): Int {
    var result = 1
    for (i in arr.indices) {
        result *= arr[i]
    }
    return result
}

// This one-liner solution uses grow as a variable of function type to multiply array collection with higher order function of reduce in lambda expression to make a single-expression functions.
val grow2: (IntArray) -> Int = { arr: IntArray -> arr.reduce { acc, num -> acc * num }}

// This solution is an alternative of above one-liner code with single-expression functions and callable function references.
fun grow3(arr: IntArray) = arr.reduce(Int::times)