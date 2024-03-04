// WPU Coding Challenge 2024
// 2/366
// https://www.codewars.com/kata/5a00e05cc374cb34d100000d

fun main() {
    print(reverseSeq(5))
}

// This solution create a list of range from n down to 1
fun reverseSeq(n: Int): List<Int> {
    var sequence = ArrayList<Int>()
    for(i in n.downTo(1)) {
        sequence.add(i)
    }
    return sequence
}

// This solution create a list from range of 1 to n then reverse the list
val reverseSeq2: (Int) -> List<Int> = { n: Int -> (1..n).toList().reversed() }

// This solution create a list from open ended range and uses map function to transform the list with n minus its value
val reverseSeq3: (Int) -> List<Int> = { n: Int -> (0..<n).map{ n - it } }

// Alternative function to create a list from range n down to 1
fun reverseSeq4(n: Int) = n.downTo(1).toList()

// This solution creates a fixed size (n size) list and uses lambda to add each element with n value minus its index
fun reverseSeq5(n: Int) = List(n){ n - it }

// This solution uses same logic with solution reverseSeq5, but start with array then convert to list
fun reverseSeq6(n: Int) = IntArray(n){ n - it }.toList()