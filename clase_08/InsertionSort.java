import java.util.Arrays;

class InsertionSort {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    static int[] createDescArray(int N) {
        int[] A = new int[N];
        for (int i = 0; i < A.length; ++i) {
            A[i] = N - i;
        }
        return A;
    }

    public static void main(String[] args) {
        // int[] testArray = createDescArray(100000);
        // long startTime = System.nanoTime();
        // insertionSort(testArray);
        // long endTime = System.nanoTime();
        // System.out.println(endTime - startTime);

        int[] testArray = createDescArray(1000000000);
        long startTimeS = System.nanoTime();
        Arrays.sort(testArray);
        long endTimeS = System.nanoTime();
        System.out.println(endTimeS - startTimeS);
    }
}
