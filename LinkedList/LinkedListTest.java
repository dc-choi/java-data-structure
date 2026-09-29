package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(1);
        head.append(2);
        head.append(2);
        head.append(2);
        head.append(3);
        head.append(3);
        head.append(3);
        head.append(4);
        head.append(4);
        head.append(5);
        head.append(5);
        head.print();
        head.delete(2);
        head.delete(3);
        head.print();

        head.removeDuplicates();
        head.print();

        Node.nthToLast(head, 3);
    }
}
