package java8;

interface ParentA{
    default void sayHello(){
        System.out.println("A says Hello");
    }
}
interface ParentB{
    default void sayHello(){
        System.out.println("B says Hello");
    }
}

class Child implements ParentA,ParentB{
    @Override
    public void sayHello() {
        ParentB.super.sayHello();
    }
}
public class Default {
    public static void main (String[]args){
        Child child1=new Child();
        child1.sayHello();
    }
}
