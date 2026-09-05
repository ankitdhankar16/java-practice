package java8;

@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class LambdaExpression {

    public static void main(String []args){
        Greeting greeting = ()-> System.out.println("Hello");
        greeting.sayHello();
    }

}
