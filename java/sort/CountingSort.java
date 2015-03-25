import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort {
  static void counting(int[] ar) {
    int[] map = new int[100];
    Arrays.fill(map, 0);

    for (int i = 0; i < ar.length; i++) {
      map[ar[i]]++;
    }

    printArray(map);
  }

  static void printArray(int[] ar) {
    for (int n :ar) {
      System.out.print(n + " ");
    }
    System.out.println("");
  }

  static public void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
        ar[i] = scanner.nextInt();
      }

      counting(ar);
  }
}
