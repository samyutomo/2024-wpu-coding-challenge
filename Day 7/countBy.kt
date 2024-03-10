// WPU Coding Challenge 2024
// 7/366
// https://www.codewars.com/kata/5513795bd3fafb56c200049e

import java.util.stream.*; // required for IntStream

fun main() {
    print(countBy(3,4).contentToString())
}

// Build List with for loop function and use add function to add element in the list, then use stream and mapToInt to enable conversion to IntArray
fun countBy(x: Int, n: Int): IntArray {
    var list = ArrayList<Int>()
    for (i in 1..n) list.add(i * x)
    return list.stream().mapToInt{it}.toArray() // alternative: return list.toTypedArray().toIntArray()
}

// Build IntArray with for loop function and Addition Assignment operator to add element in Array
fun countBy2(x: Int, n: Int): IntArray {
    var arr = intArrayOf()
    for (i in 1..n) arr += i * x
    return arr
}

// Build a List with n size, started from 1, map to create new list consist of number times x then convert to IntArray
fun countBy3(x: Int, n: Int): IntArray {
    return List(n){it + 1}.map{it * x}.toIntArray()
}

// Build a collection with generateSequence function to set the seed (initial number) of x and lambda function to calculate next number, take function to limit the size, then convert to list frist before IntArray
fun countBy4(x: Int, n: Int): IntArray {
    return generateSequence(x) {it + x}.take(n).toList().toIntArray()
}

// Build a collection with Stream to iterate number from x to the limit size, lambda function to calculate next number, then convert to IntArray
fun countBy5(x: Int, n: Int): IntArray {
    return IntStream.iterate(x) {it + x}.limit(n.toLong()).toArray()
}