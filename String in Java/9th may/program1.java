class SBDemo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);                //initial capacity
        
        sb.append("Biencaps");
        sb.append( "  "+"Core1Web");

        System.out.println(sb);
        System.out.println(sb.capacity());                              //100

        sb.append( "  "+ "Incubator");
        System.out.println(sb);
        System.out.println(sb.capacity());  

    }

}