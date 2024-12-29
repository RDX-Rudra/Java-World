public class Student {
    int rno;
    String name;  //These are called instance variables
    float marks;
 
    void greeting() {
       System.out.println("Hello! My name is " + this.name);
    }
 
    Student(Student var1) {
       this.name = var1.name;
       this.rno = var1.rno;
       this.marks = var1.marks;
    }
 
    Student(int var1, String var2, float var3) {
       this.rno = var1;
       this.marks = var3;
       this.name = var2;
    }
 
    Student() {
       this(15, "name", 10.0F);
    }
 }
