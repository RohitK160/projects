//take 2 strings from user , use own length function and compare lenmgth using if-else

import java.util.*;

class LenCom {
    static int mystrlen(String str) {
        char arr[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Strings: ");
            String s1 = sc.next();
            String s2 = sc.next();

            int x = mystrlen(s1);
            int y = mystrlen(s2);

            if (x == y) {
                System.out.println("Lengths are same");
            } else {
                System.out.println("Lengths are different");
            }
        }

    }
}