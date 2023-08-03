//creating child thread using Runnable interface

class MyThred implements Runnable{
    public void run(){
        System.out.println("in run");
        System.out.println(Thread.currentThread().getName());
    }

}
class ThredDemo{
    public static void main(String[] args) {
        MyThred obj = new MyThred();
        Thread t = new Thread(obj);

        t.start();
    }
}
// Runnable madhe run method overrride karayla ch lagte 
// thread class cha object banaun mythread cha object parameter manun pass karaycha internally :- MyThread(Runnable r) asa call jato.  