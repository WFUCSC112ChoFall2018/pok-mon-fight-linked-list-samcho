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
    public boolean find(Pokemon mon) {
        // FINISH ME
    }

    // Insert a node at the end of the list
    public void insert(Pokemon mon) {
        // FINISH ME
    }

    // Delete a node at the beginning of the Linked List and return it
    public Pokemon pop () {
        // FINISH ME
    }
}
