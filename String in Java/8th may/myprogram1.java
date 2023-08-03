class StringBufferRohit{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Rohit");
        System.out.println(sb.capacity());
        
        sb.append("RohitRohitRohitRohitRohitRoit");
        System.out.println(sb.capacity());


        sb.append("a");
        System.out.println(sb.capacity());


    }
}