package LinkedList;

/**
 * 단방향 연결 리스트
 */
public class Node {
    private int data;
    private Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    void append(int data) {
        Node newNode = new Node(data);
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void delete(int data) {
        Node current = this;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    void print() {
        Node current = this;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    /**
     * 별도의 버퍼 공간을 사용하지 않고 중복을 제거하는 코드
     */
    void removeDuplicates() {
        Node current = this;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    /**
     * 단방향 연결 리스트에서 뒤에서 number번째 원소의 값을 반환하는 코드
     */
    static int nthToLast(Node node, int number) {
        if (node == null) {
            return 0;
        }

        int count = nthToLast(node.next, number) + 1;
        if (count == number) {
            System.out.println(number + "th to last node is " + node.data);
        }

        return count;
    }
}
