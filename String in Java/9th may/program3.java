class SBDemothree{
    public static void main(String[] args) {
        String str1 = "Rohit";
        String str2 = new String ("Kachare");

        StringBuffer str3 = new StringBuffer("Core2Web");

        String str4 = str1.concat(str3);

        StringBuffer str5 = str3.append(str2);

        System.out.println(str1);                   //Rohit
        System.out.println(str2);                   //Kachare
        System.out.println(str3);                   //Core2WebKachare
        System.out.println(str4);                   //error
        System.out.println(str5);                   //Core2WebKachare

    }
}

// cocat method la string cha parameter lagto 
//error: incompatible types : stringbuffer cannot be converted to string 