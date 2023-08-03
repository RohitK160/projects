class Demo extends Thread{
    public void run(){
        System.out.println(" Demo: " + Thread.currentThread().getName() );
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("MyThred:" + Thread.currentThread().getName() );
        Demo obj = new Demo();
        obj.start();
    }
} 
class Client{
    public static void main(String[] args) {
        System.out.println("Client:" + Thread.currentThread().getName());

        MyThread1 obj = new MyThread1();
        obj.start();
    }
}