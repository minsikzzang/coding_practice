/*
 * MeetingRoom
 *
 * How to compile
 * - $ javac MeetingRoom.java Schedule.java Room.java
 *
 * How to run
 * - $ java MeetingRoom
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

public class MeetingRoom {

  static public int getMinNoRoom(ArrayList<Schedule> schedules) {
    ArrayList<Room> rooms = new ArrayList<Room>();
    rooms.add(new Room());
    for (Schedule schedule: schedules) {
      boolean booked = false;
      for (int i = 0; i < rooms.size(); i++) {
        if (rooms.get(i).book(schedule)) {
          booked = true;
        }
      }
      if (!booked) {
        Room room = new Room();
        room.book(schedule);
        rooms.add(room);
      }
      if (rooms.size() > 0) {
        Collections.sort(rooms);
      }
    }
    return rooms.size();
  }

  static public void main(String args[]) {
    ArrayList<Schedule> s = new ArrayList<Schedule>(5);
    s.add(new Schedule(2, 5));
    s.add(new Schedule(5, 7));
    s.add(new Schedule(2, 4));
    s.add(new Schedule(9, 10));
    s.add(new Schedule(6, 8));
    System.out.println("Number of meeting room required: " + getMinNoRoom(s));
  }
}
