import java.util.ArrayList;

class ArrayListSample {

    public static void main(String[] Args) {
        // create an ArrayList
        // O(1)
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // add element at the end
        // O(1)
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // Iterate from start to end O(N)
        for (int number : arr) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        // get element at position i O(1)
        System.out.println(arr.get(0));

        // set element at position i with value v O(1)
        System.out.println(arr.set(2, 4));

        for (int number : arr) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        // get arr size O(1)
        System.out.println(arr.size());
    }
}
