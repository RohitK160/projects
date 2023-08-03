// 2) join method 

class Mythread6 extends Thread{
    public void run(){
        for(int i = 0; i < 10 ;i++){
            System.out.println("in thread_0");

        }
    }
}
class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Mythread6 obj = new Mythread6();
        obj.start();
        
        obj.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("on main");
            
        }

    }
}