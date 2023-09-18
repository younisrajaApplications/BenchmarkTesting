package benchmark;

public class NanoSecBenchmark {
    public static void main(String[] args) {
        long nanoOne = System.nanoTime();
        operations();
        long nanoTwo = System.nanoTime();

        System.out.println("Duration: " + (nanoTwo - nanoOne) + "ns");
    }

    public static void operations(){
        System.out.println("Started");
        String x = "";
        for (int i = 0; i < 1000000; i++) {
            x += 1;
        }
        System.out.println("Completed");
    }
}
