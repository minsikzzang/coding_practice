/*
 * ContinentalDivide
 *
 * How to compile
 * - $ javac ContinentalDivide.java Point.java
 *
 * How to run
 * - $ java ContinentalDivide
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Exception;

public class ContinentalDivide {
  static public ArrayList<Point> findContinentalDivide(int[][] map) {
    ArrayList<Point> divide = new ArrayList<Point>();
    for (int y = 0; y < map.length; y++) {
      for (int x = 0; x < map[y].length; x++) {
        Point point = new Point(x, y, map[y][x]);
        if ((point.edgeInAtlantic(map) && point.edgeInPacific()) ||
          point.canFlowBoth(map)) {
          divide.add(point);
        }
      }
    }
    return divide;
  }

  static public void main(String[] args) {
    int[][] map = {
      {1, 2, 2, 3, 5},
      {3, 2, 3, 4, 4},
      {2, 4, 5 ,3, 1},
      {6, 7, 1, 4, 5},
      {5, 1, 1, 2, 4}
    };

    ArrayList<Point> divide = findContinentalDivide(map);

    for (Point point : divide) {
      System.out.println(point + " ");
    }
  }
}
