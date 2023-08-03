class SBDemoTwo{
    public static void main(String[] args) {
        String str1 = "Rohit";                                        //SCP
        String str2 = new String("Kachare");                //heap

        StringBuffer str3 = new StringBuffer("Core2Web");       //heap

        String str4 = str1.append(str3);
        System.out.println(str1);                                   //Rohit
        System.out.println(str2);                                   //Kachare
        System.out.println(str3);                                   //Core2Web
        System.out.println(str4);                                   //error

    }
}

// the append method is of StringBuffer class so it does not work in context of String class  
// StringBuffer str4 = str3.append (str1); this makes a new object internally  