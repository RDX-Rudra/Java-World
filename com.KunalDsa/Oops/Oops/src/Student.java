package Oops.Oops.src;

public class Student {
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello! My name is "+ this.name);
    }

    Student (Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student (int rno, String name, float marks){
        this.rno = rno;
        this.marks = marks;
        this.name = name;
    }
    
    Student (){
        // this.rno = rno;
        // this.marks = marks;
        // this.name = name;
        this(15, "name", 10.0f);
    }
}
