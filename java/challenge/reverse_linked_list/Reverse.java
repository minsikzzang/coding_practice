/*
 * Palindrome
 *
 * How to compile
 * - $ javac Reverse.java Node.java LinkedList.java
 *
 * How to run
 * - $ java Reverse
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class Reverse {
  static public void reverse(Node node) {
    Node temp = null;
    while (node != null) {
      node.print();
      temp = node.next;
      node.next = node.pre;
      node.pre = temp;
      if (temp == null) {
        break;
      }
      node = temp;
      node.print();
    }
  }

  static public void main(String args[]) {
    LinkedList list = new LinkedList();
    list.add(new Node("1"));
    list.add(new Node("2"));
    list.add(new Node("3"));
    list.add(new Node("4"));
    list.add(new Node("5"));
    list.print();
    reverse(list.head);
    list.print();
  }
}
