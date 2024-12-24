package Oops.Oops.src;
import Oops.Oops.lib.Human;
import Oops.Oops.lib.message;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Student[] students = new Student[5];
        Student s1 = new Student();
        s1.rno = 12;
        s1.name = "bbc";
        s1.marks = 17.5f;

        System.out.println(s1.marks);
        s1.greeting();

        Student s2 = new Student(13, "asd", 15.6f);
        s2.greeting();

        Student s3 = new Student(s1);
        s3.greeting();

        Student one = new Student();
        Student two = one;
        one.name = "hsau";
        System.out.println(two.name);
        two.name = "some";
        System.out.println(one.name);
        message.messages();
        Human amd = new Human(21, "Rudra", 0, false);
        Human bmd = new Human(21, "prithu", 0, false);
        System.out.println(amd.name + " " + bmd.name);
        System.out.println(Human.population);

        // greeting();

        // static doesnot depends on object it depends on class
        // we cannot use a unstatic object in a static object or instances
        // we cannot use this keyword inside static method , it only use inside object.

        App obj = new App(); // to run a non static first create an object
        // we cann't access a non static stuff without referencing their instances in a static context
        obj.greeting();
    }

    void greeting(){
        System.out.println("hi");
    }

    /**
     * Student
     * final keyword when use value will be changed but pointer will not changed
     */ 
}
