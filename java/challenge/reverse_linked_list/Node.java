public class Node {
  public Node next;
  public Node pre;
  public String value;

  public Node(String value) {
    this.next = null;
    this.pre = null;
    this.value = value;
  }

  public void print() {
    String str = "";
    if (this.pre != null) {
      str += pre.value;
    }

    str += ", ";
    if (this.next != null) {
      str += next.value;
    }

    System.out.println(str);
  }
}
