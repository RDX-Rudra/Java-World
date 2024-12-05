import java.util.Scanner;

public class Volume {
    private double radius;
    private double height;

    public Volume(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    public void cubeVol() {
        double volume = height * height * height;
        System.out.println(volume);
    }

    public void Cyl() {

        double volume = 3.14 * radius * radius * height;
        System.out.println(volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter heiht");
        int height = sc.nextInt();
        System.out.println("Enter radious");
        int radious = sc.nextInt();
        Volume obj = new Volume(height, radious);
        obj.cubeVol();
        obj.Cyl();
        sc.close();
    }
}
