// Server Side multithtreading code




import java.util.concurrent.*;

class MyThread9 implements Runnable{
    int  num;
    MyThread9(int num){
        this.num = num;

    }
    public void run(){
        System.out.println(Thread.currentThread() + " start thread : " + num);
        System.out.println(Thread.currentThread() + " end thread : " + num);

    }
    void dailyTask(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException ie){

        }
    }
}
class ThreadDemo5 {
    public static void main(String[] args) {
        
    
   ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(5); 
    for(int i = 1; i <= 4; i++){
        MyThread9 obj = new MyThread9(i);
        tpe.execute(obj);

    }
    tpe.shutdown(); 
    }

}
