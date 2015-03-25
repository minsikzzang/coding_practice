/*
 * Party
 *
 * How to compile
 * - $ javac Party.java Room.java NoAvailableRoomException.java
 *
 * How to run
 * - $ java Party
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

public class Party {
  private ArrayList<Room> rooms = new ArrayList<Room>();
  private int totalPeople = 0;
  private int numRoom = 3;
  private double[] portionsPerRoom = new double[] { 0.2, 0.3, 0.5 };

  public Party() {
    for (int i = 0; i < numRoom; i++) {
      rooms.add(new Room(portionsPerRoom[i]));
    }
  }

  public void addPeople(int numPeople) {
    for (int i = 0; i < numPeople; i++) {
      try {
        addPerson();
      } catch (NoAvailableRoomException e) {
        System.err.println(e.getMessage());
      }
    }
  }

  public void addPerson() throws NoAvailableRoomException {
    Room room = getNextRoom();
    if (room != null) {
      room.addPerson();
      this.totalPeople++;
    } else {
      throw new NoAvailableRoomException();
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Room room : this.rooms) {
      sb.append(room.toString(this.totalPeople) + "\n");
    }
    return sb.toString();
  }

  private Room getNextRoom() {
    Room nextRoom = null;
    for (Room room : this.rooms) {
      if (nextRoom == null) {
        nextRoom = room;
      } else {
        nextRoom = max(room, nextRoom);
      }
    }

    return nextRoom;
  }

  private Room max(Room a, Room b) {
    return (a.getAvailableCap(this.totalPeople) > b.getAvailableCap(this.totalPeople) ? a : b);
  }

  static public void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    Party party = new Party();
    party.addPeople(scanner.nextInt());
    System.out.print(party);
  }
}
