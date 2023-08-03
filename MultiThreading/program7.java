// Thread Group using Thread class

class MyThread7 extends Thread{
    MyThread7(ThreadGroup tg, String str){
        super(str);

    }
    public void run(){
        System.out.println(Thread.currentThread());
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            System.out.println(ie.toString());
        }

    }
}

class ThreadGroupDemo{
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup pThreadGP = new ThreadGroup("India");

        MyThread7 t1 = new MyThread7(pThreadGP , "Maharashtra");
        MyThread7 t2 = new MyThread7(pThreadGP , "Punjab");

        t1.start();
        t2.start();

        ThreadGroup cThreadGP = new ThreadGroup("pakistan");

        MyThread7 t3 = new MyThread7(cThreadGP , "karachi");
        MyThread7 t4 = new MyThread7(cThreadGP , "lahore");

        t3.start();
        t4.start();

        ThreadGroup cThreadGP2 = new ThreadGroup("Bangladesh");

        MyThread7 t5 = new MyThread7(cThreadGP2 , "Dhaka");
        MyThread7 t6 = new MyThread7(cThreadGP2 , "Mirpur");

        t5.start();
        t6.start();
       
        cThreadGP.interrupt();

        System.out.println(pThreadGP.activeCount());
        System.out.println(pThreadGP.activeGroupCount());
     }
}