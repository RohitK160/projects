import java.util.*;

class DemoT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        try{
            if(x == 0){
                throw new ArithmeticException("Divide by zero");
                
            }
            System.out.println(10/0);
        }catch(ArithmeticException obj){
            System.out.println("Exception in thread"+" "+ Thread.currentThread().getName());
            obj.printStackTrace();
        }

    }
}

