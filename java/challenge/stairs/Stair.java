/*
 * Stair
 *
 * How to compile
 * - $ javac Stair.java
 *
 * How to run
 * - $ java Stair
 *
 * Arguement
 * - number of people
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class Stair {

  static public ArrayList<String> getPossibleWays(String way, int n, ArrayList<String> ways) {
    if (n == 0) {
      ways.add(way);
    } else {
      ways = getPossibleWays(way + "1 ", n - 1, ways);
      if (n > 1) {
        ways = getPossibleWays(way + "2 ", n - 2, ways);
      }
    }
    return ways;
  }

  static public void printStringArray(ArrayList<String> arr) {
    for (String str: arr) {
      System.out.println(str);
    }
  }

  static public void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> ways = getPossibleWays("", scanner.nextInt(), new ArrayList<String>());
    printStringArray(ways);
  }
}
