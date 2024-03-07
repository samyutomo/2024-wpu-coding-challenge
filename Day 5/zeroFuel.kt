// WPU Coding Challenge 2024
// 5/366
// https://www.codewars.com/kata/5861d28f124b35723e00005e

fun main() {
    println(zeroFuel(50, 25, 2))
    println(zeroFuel(100, 50, 1))
}

// Solution logic: the distance of nearest pump divided by car miles per gallon should be minimum equal to the gallon fuel left in the car
fun zeroFuel(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean = distanceToPump / mpg <= fuelLeft

// Solution logic: the distance of nearest pump should be less than or equal to car miles per gallon times the gallon fuel left in the car
fun zeroFuel2(distanceToPump: Int, mpg: Int, fuelLeft: Int): Boolean = distanceToPump <= mpg * fuelLeft