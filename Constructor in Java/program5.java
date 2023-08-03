class C2W{
    int course = 8;
    private String FavCourse = "CPP";

    void disp(){
        System.out.println(FavCourse);
        System.out.println(course);

    }

}
class Student{
    public static void main(String[] args) {
        C2W obj = new C2W();

        obj.disp();
        System.out.println(obj.course);
        System.out.println(obj.FavCourse);              //FavCourse is private so it cant be seen in this class 

    }
}