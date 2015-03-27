/*
 * SequenceSum
 *
 * How to compile
 * - $ javac SequenceSum.java
 *
 * How to run
 * - $ java SequenceSum
 *
 * Arguement
 * - void
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class SequenceSum {

  static public boolean isSequencedSum(int[] array, int start, int sum) {
    int newSum = 0;
    for (int i = start; i < array.length; i++) {
      newSum += array[i];
      if (newSum == sum) {
        return true;
      } else if (newSum > sum) {
        return isSequencedSum(array, start + 1, sum);
      }
    }

    return false;
  }

  static public void printArray(int[] array) {
    String str = "";
    for (int i : array) {
      str += i + " ";
    }
    System.out.print(str.substring(0, str.length() - 1));
  }
  static public void main(String args[]) {
    int[] array1 = new int[] {2, 3, 5, 4, 7, 2, 11};
    int[] array2 = new int[] {1, 3, 5, 23, 2};
    int sum1 = 20;
    int sum2 = 8;
    int sum3 = 7;

    printArray(array1);
    System.out.println(", " + sum1 + ": " + (isSequencedSum(array1, 0, sum1)? "true" : "false"));

    printArray(array2);
    System.out.println(", " + sum2 + ": " + (isSequencedSum(array2, 0, sum2)? "true" : "false"));

    printArray(array2);
    System.out.println(", " + sum3 + ": " + (isSequencedSum(array2, 0, sum3)? "true" : "false"));
  }
}
