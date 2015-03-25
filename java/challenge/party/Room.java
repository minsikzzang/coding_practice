public class Room {
  private int numberOfPeople = 0;
  private double portion = 0.0;

  public Room(double portion) {
    this.portion = portion;
  }

  public void addPerson() {
    this.numberOfPeople++;
    System.out.println("Adding person to room with portion " + this.portion * 100 + "%");
  }

  public double getAvailableCap(int totalPeople) {
    return (totalPeople * this.portion) - this.numberOfPeople;
  }

  public String toString(int totalPeople) {
    return "Room(portion " + this.portion * 100 + "%): number of people: " +
      this.numberOfPeople + ", fill rate: " + (this.numberOfPeople / (double)totalPeople) * 100 + "%";
  }
}
