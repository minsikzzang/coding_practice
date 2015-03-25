/*
 * Matrix
 *
 * How to compile
 * - $ javac Matrix.java
 *
 * How to run
 * - $ java Matrix
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

public class Matrix {

  static public Integer[] getSortedElements(int[][] matrix) {
    if (matrix.length <= 0) {
      return null;
    }

    ArrayList<Integer> sorted = new ArrayList<Integer>();
    int total = matrix.length * matrix[0].length;
    int[] row = new int[matrix.length];
    int min = -1;
    Arrays.fill(row, 0);

    while (sorted.size() < total) {
      for (int i = 0; i < matrix.length; i++) {
        if (row[i] == 0) {
          for (int k = 0; k < matrix[i].length; k++) {
            if (matrix[i][k] != 0) {
              row[i] = matrix[i][k];
              matrix[i][k] = 0;
              break;
            }
          }
        }
      }

      int n = 0;
      for (int i = 0; i < row.length; i++) {
        if (min <= 0 || (row[i] < min && row[i] > 0)) {
          min = row[i];
          n = i;
        }
      }

      sorted.add(min);
      min = -1;
      row[n] = 0;
    }
/*
    while (sorted.size() < total) {
      int v = 999;
      int x = 0, y = 0;
      total = 0;

      for (int i = 0; i < matrix.length; i++) {
        for (int k = 0; k < matrix[i].length; k++) {

          int a = matrix[i][k];
          if (a > 0 && v > a) {
            x = i;
            y = k;
            v = a;
          }
          total++;
        }
      }
      matrix[x][y] = -1;
      sorted.add(v);
    }
*/
    return sorted.toArray(new Integer[sorted.size()]);
  }

  static public void printArray(Integer[] arr) {
    for (Integer i: arr) {
      System.out.print(i + " ");
    }
    System.out.println(" ");
  }

  static public void main(String args[]) {
    int matrix[][] = new int[][] {
      {20, 40, 80},
      {5, 60, 90},
      {45, 50, 55}
    };
    Integer[] elements = getSortedElements(matrix);
    if (elements != null) {
      printArray(elements);
    }
  }
}
