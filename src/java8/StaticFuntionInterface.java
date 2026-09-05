package java8;

interface A{
    /*

    1. we can't override this function because class can't see this funtion and if we
    create class that implements this interface and create a function with same name than
    that class will create a new function with that name it will not override it

    2. we can't call this function by class object and class name that implements it

    3. We can call this function by interface name
    */
    static void getName(){
        System.out.println("Ankit");
    }
}
public class StaticFuntionInterface{
    public static void main(String[] args) {
        A.getName();
    }
}
