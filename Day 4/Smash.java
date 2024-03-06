import java.util.Arrays;

public class Smash {

	public static String smash(String... words) {
    return String.join(" ", words);
  }

  public static void main(String[] args) {
    System.out.println(smash("hello", "world", "this", "is", "great"));
  }
}