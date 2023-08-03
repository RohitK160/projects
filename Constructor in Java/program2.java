// Real time example

class IPL{
    int runs = 100;
    void player(){
        System.out.println("man of the match");
    }
    public static void main(String[] args) {
        IPL obj = new IPL();

        obj.player();
        System.out.println(obj.runs);
    }
}