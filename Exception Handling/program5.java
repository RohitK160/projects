import java.util.*;
class DataOverFlowException extends RuntimeException{
     DataOverFlowException(String msg){
        super(msg);
     }
}
class DataUnderFlowException extends RuntimeException{
    DataUnderFlowException(String msg){
        super(msg);
    }
}
class ArrayDemo{
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        System.out.println("Note: 0<value<100");

        for(int i = 0; i <arr.length; i++){
            int data = sc.nextInt();
            if(data < 0){
                throw new DataUnderFlowException("barka no dila re tu");
            }
            if(data > 0){
                throw new DataOverFlowException("lai motha no dila re tu ata ");

            }
            arr[i] = data;


        }
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]+" ");

        }
    }
}