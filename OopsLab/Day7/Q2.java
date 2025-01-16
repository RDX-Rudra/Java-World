package OopsLab.Day7;

public class Q2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
