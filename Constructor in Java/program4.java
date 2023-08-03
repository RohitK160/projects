class Demo{
    int x = 10;
    String str1 = "shashi";

    void fun(){
        String str2 = "shashi";
        String str3 = new String("core2web");
        System.out.println(str3);
        System.out.println(str2);

    }
}
class Client{
    public static void main(String[] args) {
        Demo x = new Demo();

        x.fun();
    }
}