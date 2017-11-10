public class MyLinkedList<T> {
    private Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public boolean add(T value) {
        if (head == null) {
            head = new Node<T>(value);
            return true;
        }
        Node<T> tracker = head;
        while (tracker.next != null) {
            tracker = tracker.next;
        }
        tracker.next = new Node<T>(value);
        return true;
    }

    public String toString() {
        if (head == null) {
            return "[]";
        }
        String output = "[";
        Node<T> tracker = head;
        while (tracker.next != null) {
            output += tracker.getValue() + ", ";
        }
        return output.substring(0, output.length() - 2) + "]";
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
