class Sum {

    static int sumLinear(int n) {
        if (n == 0) return 0;
        return sumLinear(n - 1) + n;
    }

    static int sumQuadratic(int n) {
        if (n == 0) return 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum++;
        }
        return sum + sumQuadratic(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("%d\n", sumLinear(n));
        System.out.printf("%d\n", sumQuadratic(n));
    }
}
