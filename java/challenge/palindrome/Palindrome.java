/*
 * Palindrome
 *
 * How to compile
 * - $ javac Palindrome.java
 *
 * How to run
 * - $ java Palindrome
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class Palindrome {

  static public void assertTrue(boolean b) {
    System.out.println(b == true ? "Success" : "Fail");
  }

  static public boolean isPalindrome(String str) {
    int pos = str.length() - 1;
    for (int i = 0; i < pos; i++, pos--) {
      char c = str.charAt(i);
      if (!Character.isLetterOrDigit(c)) {
        continue;
      }

      while (!Character.isLetterOrDigit(str.charAt(pos))) {
        pos--;
      }

      if (Character.toLowerCase(c) != Character.toLowerCase(str.charAt(pos))) {
        return false;
      }
    }
    return true;
  }

  static public void main(String args[]) {
    assertTrue(isPalindrome("ABA"));
    assertTrue(isPalindrome("A!#A"));
    assertTrue(isPalindrome("A man, a plan, a canal, Panama!"));
    assertTrue(isPalindrome("aBbA"));
    assertTrue(isPalindrome("aBaA"));
    assertTrue(isPalindrome("1a00A1"));
  }
}
