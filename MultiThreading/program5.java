/*concurrency methods in java
1. sleep (native and normal)
2. join (native)
3. yeild (native) */



// 1) Sleep method
class MyThread5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 obj = new MyThread5();
        obj.start();

        Thread.sleep(100);

        Thread.currentThread().setName("Priyanka");
        System.out.println(Thread.currentThread());
    }
}


