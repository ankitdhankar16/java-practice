package oops.classBasics;

class Student1{
    int rollNo;
    int age;
    String name;
    String college;
    //Default constructor
    Student1(){
        rollNo=1;
        age=18;
        name="NA";
        college="NA";
    }
    //parameterized constructor
    Student1(int rollNo, String name,int age,String college){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.college=college;
    }

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
