 class PatternOne {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(num + " ");
                num = num + 3 * i + j;
            }
            System.out.println();
        }
    }
}
