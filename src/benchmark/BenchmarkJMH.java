package benchmark;

import org.openjdk.jmh.annotations.Benchmark;

public class BenchmarkJMH {
    @Benchmark
    public static void operations(){
        System.out.println("Started");
        String x = "";
        for (int i = 0; i < 1000000; i++) {
            x += 1;
        }
        System.out.println("Completed");
    }
}
