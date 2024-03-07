// WPU Coding Challenge 2024
// 3/366
// https://www.codewars.com/kata/59ca8246d751df55cc00014c

fun main() {
    print(hero(10,5))
}

// Solution logic: the bullets carried must be twice the number of dragons
val hero: (Int, Int) -> Boolean = { bullets: Int, dragons: Int -> dragons*2 <= bullets }

// Solution with bitwise operations
fun hero2(bullets: Int, dragons: Int): Boolean = dragons shl 1 <= bullets