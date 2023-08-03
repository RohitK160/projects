import java.util.*;

class ReverseDemo{
    static void myReverse(String str){
        int iStrLen = str.length();
        while(iStrLen >0){
            System.out.println(str.charAt(iStrLen-1));
            iStrLen--;
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String str = x.next();
        myReverse(str);
    }
}