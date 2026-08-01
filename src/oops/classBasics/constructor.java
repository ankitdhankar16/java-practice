package oops.classBasics;

class Student1{
    int rollNo;
    int age;
    String name;
    String college;

    /*Default constructor : if we dont create it java automatically creates the default construtor
      which will assign default vaules to instance variables
    * */
    Student1(){
        rollNo=1;
        age=18;
        name="NA";
        college="NA";
    }

    //parameterized constructor
    Student1(int rollNo, String name,int age,String college){

        /*this keyword refers to current object */
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.college=college;
    }
    /*NOTE : if we make parameterized constructor and we want to create the object with default constructor
    than it will give the error because java will not create it automatically now so to do this we have to
    create the constructor by ourself (overload constructors) so that we can use it to create the object
     */

    public void markAttendance(){
        System.out.println("Attendance marked by "+name);
    }
    public void printStudent(){
        System.out.println(name+" , "+rollNo + " , "+ age + " , " + college);
    }
}

public class constructor {
    public static void main(String[]args){
        Student1 s1=new Student1();
        s1.printStudent();
        Student1 s2=new Student1(118,"Atul",17,"Delhi University");
        s2.printStudent();
    }

}
