class parentDemo{
    int x = 10;
    static int y = 20;

    static{
        System.out.println("par st blk");
    }
    parentDemo(){
        System.out.println("in par const");
    }
    void m1(){
        System.out.println(x);
        System.out.println(y);

    }
    static void m2(){
        System.out.println(y);

    }
}
class childDemo extends parentDemo{
    static{
        System.out.println("child st blk");

    }
    childDemo(){
        System.out.println("child const");

    }
}

class Client1{
    public static void main(String[] args) {
        childDemo obj = new childDemo();
        obj.m1();
        obj.m2();
    }
}
