
public class genericsExample {
    public static void main(String[] args) {
        // IntegerPrinter printer = new IntegerPrinter(23);
        // printer.print();
        GenericPrinter<Integer> printer = new GenericPrinter<Integer>(23);

        printer.print();
    }
}
