import java.util.*;

public class MyHashtable {
    private ArrayList<MyLinkedList<Entry>> array;

    public MyHashtable() {
        array = new ArrayList<MyLinkedList<Entry>>();
        for (int i = 0; i < 10; i++) {
            array.add(new MyLinkedList<Entry>());
        }
    }

    private int getHashCode(String key) {
        return (int) (Math.pow(key.length(), 3));
    }

    public boolean put(String key, String value)
    {
        int hashCode = getHashCode(key);
        System.out.println(array.size());
        array.get(hashCode % array.size()).add(new Entry(key, value));
        return true;
    }

    public String toString()
    {
        if (array.size() == 0) {
            return "{}";
        }
        String output = "{";
        for (int i = 0; i < array.size(); i++) {
            MyLinkedList<Entry> entries = array.get(i);
            output += String.format("\n\t[%d]: ", i);
            for (Entry e : entries) {
                output += e + ", ";
            }
        }
        return output.substring(0, output.length() - 2) + "\n}";
    }

    private class Entry {
        public final String key, value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return String.format("(%s, %s)", key, value);
        }
    }
}
