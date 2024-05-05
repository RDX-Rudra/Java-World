import java.util.ArrayList;

public class genericsExample {
    public static void main(String[] args) {
        // IntegerPrinter printer = new IntegerPrinter(23);
        // printer.print();
        GenericPrinter<Integer> printer = new GenericPrinter<Integer>(23);

        printer.print();

        GenericPrinter<Double> doubleprinter = new GenericPrinter<Double>(33.5);
        doubleprinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat mycat = cats.get(0);
    }
}
