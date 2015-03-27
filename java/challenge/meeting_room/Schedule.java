public class Schedule {

  public int start;
  public int end;

  /**
   * start - start time in hour
   * end - end time in hour
   */
  public Schedule(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public boolean isValid() {
    return (this.start >= 0 && this.end < 24 && this.start < this.end);
  }
}
