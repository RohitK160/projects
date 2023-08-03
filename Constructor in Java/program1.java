class ConstDemo{
    ConstDemo(){
        System.out.println("in CondtDemo");

    }
    void fun(){
        ConstDemo obj = new ConstDemo();
    }
    public static void main(String[] args) {
        ConstDemo obj1 = new ConstDemo();
        ConstDemo obj2 = new ConstDemo();

        obj1.fun();
        
    }
}