class Sum {

    // O(1)
    public static int sum1(int N) {
        return ((N + 1) * N) / 2;
    }

    // O(N)
    public static int sum2(int N) {
        int sum = 0;
        for (int i = 1; i <= N; ++i) sum += i;
        return sum;
    }

    // O(N^2)
    public static int sum3(int N) {
        int sum = 0;
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= i; ++j) {
                ++sum;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum3(100));
        System.out.println(sum3(4));
        System.out.println(sum3(3));
        System.out.println(sum3(2));
        System.out.println(sum3(1));
    }
}
