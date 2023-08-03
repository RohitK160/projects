// premt class madhali method exception throw karat nasel ani apn child class madhe ti method overrride keli tar compile time erroe yeto
// hence insted of throw use try catch

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("In run");
            try{
                Thread.sleep(1000);

            }catch(InterruptedException obj){

            }

        }
    }
}

class ThreadDemo{
    public static void main(String[] args) throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("In main");
            Thread.sleep(1000);
            
        }
    }
}