//create an array print even count

import java.util.*;
class ArrayDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        
        int n = sc.nextInt();
        int count = 0;
        System.out.println("Enter Elements");
        int arr[] = new int[n];

        
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                count++;
            }
        }
        System.out.println("Even elements count: " + count);
    }
}