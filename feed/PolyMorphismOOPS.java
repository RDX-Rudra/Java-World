class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public static void printInfo(int age){
        System.out.println(age);
    }
    public static void printInfo(String name, int age){
        System.out.println(name +" "+ age);
    }

    Student(){
        
    }
}

public class PolyMorphismOOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.age = 19;
        s1.name = "Rudra";
        s1.printInfo(s1.name);
    }
}