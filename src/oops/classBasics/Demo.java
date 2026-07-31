package oops.classBasics;

class Student{
    int rollNo;
    int age;
    String name;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked by "+name);
    }
    void printStudent(){
        System.out.println(name+" , "+rollNo + " , "+ age + " , " + college);
    }
}
public class Demo {
    public static void  main(String [] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name= "Ankit";
        s1.age = 27;
        s1.college="Amity University";
        s1.rollNo=1001;
        s2.name="Abhishek";
        s2.rollNo=1008;
        s2.college="Amity University";
        s2.age=28;
        s1.markAttendance();
        s2.markAttendance();
        s1.printStudent();
        s2.printStudent();
    }
}
