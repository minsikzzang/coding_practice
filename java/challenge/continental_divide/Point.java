import java.math.*;

public class Point {
  private int x;
  private int y;
  private int value;

  public Point(int x, int y, int value) {
    this.x = x;
    this.y = y;
    this.value = value;
  }

  public int value() {
    return this.value;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ") => " + this.value;
  }

  public boolean canFlowBoth(int[][] map) {
    boolean heightestInLat = true;
    boolean heightestInLng = true;

    for (int i = 0; i < map[this.y].length; i++) {
      if (!(heightestInLat = isHeightPoint(this.value, i, x, map[this.y][i]))) {
        break;
      }
    }

    for (int i = 0; i < map.length; i++) {
      if (!(heightestInLng = isHeightPoint(this.value, i, y, map[i][this.x]))) {
        break;
      }
    }

    return heightestInLat || heightestInLng;
  }

  public boolean edgeInPacific() {
    return (this.x == 0 || this.y == 0);
  }

  public boolean edgeInAtlantic(int[][] map) {
    return (this.x == map[0].length - 1 || this.y == map.length - 1);
  }

  private boolean isHeightPoint(int value, int index, int point, int mapPoint) {
    return ((value >= mapPoint) && (this.value != mapPoint || Math.abs(index - point) <= 1));
  }
}
