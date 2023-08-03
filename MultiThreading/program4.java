// Priority of Threads

class MyThread3 extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());
    }
}
class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getPriority());

        MyThread3 obj1 = new MyThread3();
        obj1.start();


    }
}