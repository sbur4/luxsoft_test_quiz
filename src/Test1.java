public class Test1 {
    private volatile int test1 = 0;

    public void run() {
        for (int i = 0; i < 500; i++) {
            test1++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        Thread th1 = new Thread(test1::run);
        Thread th2 = new Thread(test1::run);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(test1.test1);
    }
}