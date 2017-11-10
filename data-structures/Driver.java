public class Driver {
    public static void main(String[] args)
    {
        MyLinkedList<Integer> intList = new MyLinkedList<Integer>();
        for (int i : new Integer[]{1, 2, 3, 4, 5}) {
            intList.add(i);
            System.out.println(intList);
        }
    }
}
