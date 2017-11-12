import java.util.*;

public class MyLinkedList<T> implements Iterable<T> {
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

    public Iterator<T> iterator() {
        return new MyLinkedListIterator(this);
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

    private class MyLinkedListIterator implements Iterator<T>{
        private MyLinkedList linkedList;
        private Node<T> currentNode;

        public MyLinkedListIterator(MyLinkedList linkedList) {
            this.linkedList = linkedList;
            currentNode = head;
        }

        public boolean hasNext() {
            return currentNode != null;
        }

        public T next() {
            if (hasNext()) {
                T output = currentNode.value;
                currentNode = currentNode.next;
                return output;
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
