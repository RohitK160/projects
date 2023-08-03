import java.io.*;
class DemoTwo{
    void m1(){
        System.out.println("ROhit");

    }
    void m2(){

    }
    public static void main(String[] args) {
        System.out.println("start main");
        DemoTwo obj = new DemoTwo();
        
        obj.m1();
        obj = null;

        try{
            obj.m2();
        }catch(NullPointerException ob){
            System.out.println("object null kelyavar ky ghanta access karnares ka?");

        }
        finally{
            System.out.println("Connection close");
        }
        System.out.println("end main");

    }
}