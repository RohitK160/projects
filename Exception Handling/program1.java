class Demo{
    public static void main(String[] args) {
        System.out.println("start main");

        try{
            System.out.println(10/0);
        }catch(ArithmeticException obj){
            System.out.println("Tuzya bapani 0 ne divide kela hota ka !!!!!");

        }
        System.out.println("end main");
    }
}