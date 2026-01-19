class AllLinkedLists {
    static class SinglyLinkedList {
        class Node {
            int data;
            Node next;
            Node(int data) { this.data = data; }
        }
        Node head;
        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
            }
        }
        void delete(int key) {
            if (head == null) return;
            if (head.data == key) { head = head.next; return; }
            Node temp = head;
            while (temp.next != null && temp.next.data != key) temp = temp.next;
            if (temp.next != null) temp.next = temp.next.next;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    static class DoublyLinkedList {
        class Node {
            int data;
            Node prev, next;
            Node(int data) { this.data = data; }
        }
        Node head;
        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) head = newNode;
            else {
                Node temp = head;
                while (temp.next != null) temp = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
            }
        }
        void delete(int key) {
            if (head == null) return;
            if (head.data == key) { head = head.next; if (head != null) head.prev = null; return; }
            Node temp = head;
            while (temp != null && temp.data != key) temp = temp.next;
            if (temp == null) return;
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    static class CircularLinkedList {
        class Node {
            int data;
            Node next;
            Node(int data) { this.data = data; }
        }
        Node head = null, tail = null;
        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
        void delete(int key) {
            if (head == null) return;
            if (head.data == key) {
                if (head == tail) head = tail = null;
                else { head = head.next; tail.next = head; }
                return;
            }
            Node temp = head;
            do {
                Node next = temp.next;
                if (next.data == key) {
                    temp.next = next.next;
                    if (next == tail) tail = temp;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
        }
        void display() {
            if (head == null) return;
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.insert(1); s.insert(2); s.insert(3);
        System.out.print("Singly: "); s.display();
        s.delete(2); s.display();

        DoublyLinkedList d = new DoublyLinkedList();
        d.insert(10); d.insert(20); d.insert(30);
        System.out.print("Doubly: "); d.display();
        d.delete(20); d.display();

        CircularLinkedList c = new CircularLinkedList();`
        c.insert(5); c.insert(6); c.insert(7);
        System.out.print("Circular: "); c.display();
        c.delete(6); c.display();
    }
}


