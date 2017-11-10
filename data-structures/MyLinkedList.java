public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean add(T value) {
        if (head == null) {
            head = new Node<T>(value);
            size++;
            return true;
        }
        Node<T> tracker = head;
        while (tracker.next != null) {
            tracker = tracker.next;
        }
        tracker.next = new Node<T>(value);
        size++;
        return true;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        String output = "[";
        Node<T> tracker = head;
        while (tracker != null) {
            output += tracker.getValue() + ", ";
            tracker = tracker.next;
        }
        return output.substring(0, output.length() - 2) + "]";
    }

    public int size() {
        return size;
    }

    private class Node<T> {
        private T value;
        public Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
