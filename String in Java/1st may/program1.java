class StringDemo{
    public static void main(String[] args) {
        String str1 = "Core2Web";                                       //SCP
        String str2 = new String("Core2Web");                  //HEAP

        char str3[] = {'c','2','w'};                                    //HEAP

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}