// WPU Coding Challenge 2024
// 6/366
// https://www.codewars.com/kata/5556282156230d0e5e000089

fun main() {
    print(dnaToRna("TTTT"))
}

// This solution uses for loop to create a new string by adding character by character and a replacement condition if the character is equal to 'T'
fun dnaToRna(dna: String): String {
    var rna = ""
    for (i in dna){
        rna += if (i == 'T') "U" else i
    }
    return rna
}

// This solution uses split to convert String to List, Map changes each element based on condition, and joinToString convert the List to String without any change to the separator
fun dnaToRna3(dna: String): String = dna.split("").map{ if (it == "T") 'U' else it }.joinToString("")

// This solution uses the trick to make a List by splitting the character of "T" as separator then joinToString convert the List to String with change the separator as character of "U"
fun dnaToRna2(dna: String): String = dna.split("T").joinToString("U")

// This solution uses replace function with parameter char and char
fun dnaToRna5(dna: String): String = dna.replace('T', 'U')

// This solution uses replace function with parameter String and String
fun dnaToRna6(dna: String): String = dna.replace("T", "U")

// This solution uses replace function with regex
fun dnaToRna4(dna: String): String = dna.replace("T".toRegex(), "U")
