class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class STUDENTdETAILSoOPS{
    public static void main(String args[]){
        Student s1 = new Student("Rudra", 19);
        //s1.age = 19;
        //s1.name = "Rudra";
        s1.printInfo();
    }
}