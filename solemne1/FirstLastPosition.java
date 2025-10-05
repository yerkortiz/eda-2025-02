import java.util.Arrays;

class FirstLastPosition {

    public static void firstAndLastPosition(int[] A, int key) {
        int first = findPosition(A, key, true);
        int last = findPosition(A, key, false);

        if (first == -1) {
            System.out.println("-1");
        } else {
            System.out.println(first + ", " + last);
        }
    }

    private static int findPosition(int[] A, int key, boolean findFirst) {
        int low = 0,
            high = A.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (A[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void firstAndLastPositionAlternative(int[] A, int key) {
        int index = Arrays.binarySearch(A, key);

        if (index < 0) {
            System.out.println("-1");
            return;
        }

        int start = index;
        int end = index;

        while (start > 0 && A[start - 1] == key) {
            start--;
        }

        while (end < A.length - 1 && A[end + 1] == key) {
            end++;
        }

        System.out.println(start + ", " + end);
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 2, 3, 4, 5 };
        int key = 2;
        firstAndLastPosition(A, key);
    }
}
