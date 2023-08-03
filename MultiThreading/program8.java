// Thread group using runnable

class MyThread8 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(5000);

        }catch(InterruptedException ie){
            System.out.println(ie.toString());
        }
    }
}
class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup pThreadGP = new ThreadGroup("India");

        MyThread7 t1 = new MyThread7(pThreadGP , "Maharashtra");
        MyThread7 t2 = new MyThread7(pThreadGP , "Punjab");

        t1.start();
        t2.start();
        
    }
}
