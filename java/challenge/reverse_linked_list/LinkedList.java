class LinkedList {
  public Node head;
  public Node tail;

  public void add(Node node) {
    if (this.head == null && this.tail == null) {
      this.head = node;
      this.tail = node;
    } else {
      if (this.head.next == null) {
        this.head.next = node;
      }
      this.tail.next = node;
      this.tail = node;
    }
  }

  public void print() {
    Node current = this.head;
    while (current != null) {
      System.out.print(current.value + " ");
      current = current.next;
    }
    System.out.println("");
  }
}
