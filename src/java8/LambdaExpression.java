package java8;

@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class LambdaExpression {
    Greeting greeting = ()-> System.out.println("Hello");

    public static void main(String []args){
        LambdaExpression lambdaExpression=new LambdaExpression();
        lambdaExpression.greeting.sayHello();
    }

}
