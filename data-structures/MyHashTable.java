public class MyHashtable {
    private LinkedList<Entry>[] array;

    public MyHashTable() {
        array = new LinkedList<Entry>()[10];
    }

    private int getHashCode(String key) {
        return value.length()**2;
    }

    public boolean put(String key, String value)
    {
        int hashCode = getHashCode(key);
        array[hashCode % array.length].add(new Entry(key, value));
    }

    public String toString()
    {
        String output = "";
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
