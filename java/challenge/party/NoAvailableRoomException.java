import java.lang.Exception;

public class NoAvailableRoomException extends Exception {
  public NoAvailableRoomException() {
    super("No available room");
  }
}
