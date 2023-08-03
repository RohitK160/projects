import java.io.*;

class ExecptionDemo{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str);
        int data = 0;
        try{
            data = Integer.parseInt(br.readLine());

        }catch(NumberFormatException onj){
            System.out.println("integer value tak ki yedya");
            data = Integer.parseInt(br.readLine());
        }
        System.out.println(data);


    }
}