public class Staticblock {
    static int a=5;
    static int b;

    // wil only run once when the first object is created i.e when the class is loded for the first time
    static{
        System.out.println("hey i am in static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        Staticblock obj = new Staticblock();
        System.out.println(obj.a + " " + obj.b);

        obj.b += 3;
        System.out.println(obj.b);

        Staticblock obj2 = new Staticblock();
        System.out.println(obj2.a + " " + obj.b);

    }
}
