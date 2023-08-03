 class PatternTwo {
    public static void main(String[] args) {
        String[][] arr = {{"3", "b", "1", "d"}, {"a", "2", "c", "0"}, {"3", "b", "1", "d"}, {"a", "2", "c", "0"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }
}
