// WPU Coding Challenge 2024
// 7/366
// https://www.codewars.com/kata/5513795bd3fafb56c200049e

import java.util.*;
import java.util.stream.*;

public class CountBy{
  public static int[] countBy(int x, int n){
    List<Integer> arrlist = new ArrayList<Integer>();
    for (int i = 1; i <= n; i++) arrlist.add(i * x);
    return arrlist.stream().mapToInt(i -> i).toArray();
  }
  
  public static int[] countBy2(int x, int n){
    int[] arrint = new int[n];
    for (int i = 1; i <= n; i++) z[i-1] = i * x;
    return arrint;
  }
  
  public static int[] countBy3(int x, int n){
    return IntStream.iterate(x, i -> i + x).limit(n).toArray();
  }

  public static int[] countBy4(int x, int n){
    return IntStream.rangeClosed(1, n).map(i -> i * x).toArray();
  }
  
  public static void main(String[] args) {
    System.out.println(Arrays.toString(countBy(2,5)));
  }
}