import java.util.Arrays;

class SortAndSearch {

    public static void main(String[] args) {
        int[] P = { 7, 2, 3, 5, 13, 11, 17, 23, 19 };
        Arrays.sort(P);
        for (int p : P) {
            System.out.printf("%d\n", p);
        }
        System.out.println(Arrays.binarySearch(P, 4));
        System.out.println(Arrays.binarySearch(P, 17));
    }
}
