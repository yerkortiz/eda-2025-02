class IntegerToBinary {

    public static String integerToBinary(int N) {
        String s = "";
        while (N > 0) {
            s = (N % 2) + s;
            N /= 2;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(integerToBinary(8));
        System.out.println(integerToBinary(7));
        System.out.println(integerToBinary(5));
        System.out.println(integerToBinary(13));
    }
}
