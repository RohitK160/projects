class StringDemoTwo{
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = "Kachare";

        System.out.println(str1 + str2);

        String str3 = "RohitKachare";
        String str4 = str1  + str2;

        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

    }
}