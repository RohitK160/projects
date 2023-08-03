import java.io.*;

class ArrayInput{
    public static void main(String [] args)throws IOException
{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];

        System.out.println("Enter values:");
        for(int i= 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());

        }
        System.out.println("output:");
        for(int i = 0; i<5 ;i++){
            System.out.println(arr[i]);
        }
    }










}