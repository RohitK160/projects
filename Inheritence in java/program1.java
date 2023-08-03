class Parent{
    Parent(){
        System.out.println("In Par consrt");
        ;
    }
    void ParProp(){
        System.out.println("flat, car, gold");
        
    }

}

class Child extends Parent{
    Child(){
        System.out.println("In child comst");

    }

}
class Client{
    public static void main(String[] args) {
        Child obj  = new Child();
        obj.ParProp();
    }
}