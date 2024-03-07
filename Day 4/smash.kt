// WPU Coding Challenge 2024
// 4/366
// https://www.codewars.com/kata/53dc23c68a0c93699800041d

fun main() {
    print(smash(listOf("hello", "world", "this", "is", "great")))
}

// This solution uses for loop to concatenate each word with a space but not the last word
fun smash(words: List<String>): String {
    var sentence = ""
    for (i in words) {
        sentence += "$i"
        if (i != words.last()) sentence += " "
    }
    return sentence
}

// This solution uses joinToString function to join all the words
fun smash2(words: List<String>): String = words.joinToString(separator = " ")