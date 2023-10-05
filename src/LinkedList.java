public class LinkedList {
    private static class Node {
        Pokemon mon; // object in node
        Node next; // next Node in linked list

        // default constructor
        public Node() {
            mon = new Pokemon();
            next = null;
        }
        // constructor
        public Node(Pokemon m, Node n) {
            mon = m;
            next = n;
        }
    }
    private Node head; // first node in linked list

    // default constructor
    LinkedList() {
        head = null;
    }

    public void print() {
        Node runner = head; // start at the head
        while (runner.next != null) { // keep going until the end
            System.out.println(runner.mon); // print Pokémon
            runner = runner.next; // go to next node
        }
    }

    // find a node, return whether found or not
    public Node find(Pokemon mon) {
        Node runner = head;
        // check if empty list
        if (runner != null) {
          while (runner.next != null) {
              if(runner.mon.compareTo(mon) == 0) {
                  return runner; // found node with Pokémon
              } else {
                  runner = runner.next; // go to next node
              }
          }
          return null; // does not exist in list
        } else {
            return null; // empty list
        }
    }

    // Insert a node at the end of the list
    public void insert(Pokemon mon) {
        // create and initialize a node with parameter mon
        Node newNode = new Node();
        newNode.mon = mon;

        if (head == null) { // empty list
            head = newNode; // create a list with one mon
        } else {
            // start off at beginning
            Node runner = head.next;
            Node previous = head;
            // while not at end of list
            while (runner != null) {
                // traverse list
                previous = runner;
                runner = runner.next;
            }
            // insert node into list
            previous.next = newNode;
        }
    }

    // Delete a node at the beginning of the Linked List and return it
    public Pokemon pop () {
        // if empty list
        if (head == null) {
            return null;
        }
        Node temp = head; // saving the node at head
        head = head.next; // moving the head over one
        return temp.mon; // returning the mon at the saved node
    }
}
