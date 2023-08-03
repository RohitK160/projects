class HashCodeDemo{
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = new String("Rohit");
        String str3 = "Rohit";
        String str4 = new String("Rohit");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}