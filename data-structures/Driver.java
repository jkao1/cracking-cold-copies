public class Driver {
    public static void main(String[] args)
    {
        MyHashtable hashtable = new MyHashtable();
        for (String s : new String[]{"", "cracking", "mary", "machime", "jason", "emacs", "vim", "santagato", "cubed", "etcerta", "eggwash"}) {
            hashtable.put(s, new StringBuilder(s).reverse().toString());
        }
        System.out.println(hashtable);
    }
}
