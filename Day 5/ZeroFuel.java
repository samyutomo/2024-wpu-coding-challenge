// WPU Coding Challenge 2024
// 5/366
// https://www.codewars.com/kata/5861d28f124b35723e00005e

public class ZeroFuel {
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return distanceToPump <= mpg * fuelLeft;
  }

  public static void main(String[] args) {
    System.out.println(zeroFuel(50, 25, 2));
  }
}