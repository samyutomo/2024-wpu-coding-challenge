// WPU Coding Challenge 2024
// 4/366
// https://www.codewars.com/kata/53dc23c68a0c93699800041d

import java.util.Arrays;

public class Smash {

	public static String smash(String... words) {
    return String.join(" ", words);
  }

  public static void main(String[] args) {
    System.out.println(smash("hello", "world", "this", "is", "great"));
  }
}