//Type 2 of declaration of jagged array
import java.util.*;
class JaggedArray{
    public static void main(String[] args) {
        int arr[][] = new int [3][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];

        for (int i = 0; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array is:");
        for (int i = 0; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}