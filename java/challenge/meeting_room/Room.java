import java.lang.*;
import java.util.*;

public class Room implements Comparable<Room> {
  public boolean[] hourSlots = new boolean[24];
  private int numAvailableSlots = 24;

  public Room() {
    Arrays.fill(hourSlots, false);
  }

  public boolean book(Schedule s) {
    boolean booked = false;
    int start = s.start - 1;
    int end = s.end - 1;

    for (int i = start; i < end; i++) {
      if (this.hourSlots[i] == true) {
        booked = true;
      }
    }

    if (booked == false) {
      for (int i = start; i < end; i++) {
        this.hourSlots[i] = true;
        numAvailableSlots--;
      }
    }
    return !booked;
  }

  public int getNumAvailableSlots() {
    return this.numAvailableSlots;
  }

  // @Override
  public int compareTo(Room room) {
    if (this.numAvailableSlots > room.getNumAvailableSlots()) {
      return -1;
    } else if (this.numAvailableSlots < room.getNumAvailableSlots()) {
      return 1;
    } else {
      return 0;
    }
  }
}
