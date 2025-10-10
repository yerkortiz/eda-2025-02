class MergeSort {

    static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, hi);
    }

    static void merge(int[] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int n1 = mid - lo + 1;
        int n2 = hi - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[lo + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + j + 1];
        }
        int i = 0,
            j = 0,
            k = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[lo + k] = L[i];
                ++i;
                ++k;
            } else {
                arr[lo + k] = R[j];
                ++j;
                ++k;
            }
        }
        while (i < n1) {
            arr[lo + k] = L[i];
            ++i;
            ++k;
        }
        while (j < n2) {
            arr[lo + k] = R[j];
            ++j;
            ++k;
        }
    }
}
