package Oops.Oops.lib;

public class Human {
    int age;
    public String name;
    int salary;
    boolean married;
    public static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;  // also work with this.population
    }
}
