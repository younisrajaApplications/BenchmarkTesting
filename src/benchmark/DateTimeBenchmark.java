package benchmark;

import java.util.Date;

public class DateTimeBenchmark {
    public static void main(String[] args) {
        Date dateOne = new Date();
        operations();
        Date dateTwo = new Date();

        System.out.println("Duration: " + (dateTwo.getTime() - dateOne.getTime()) + " ms");
        System.out.println("Duration: " + ((dateTwo.getTime() - dateOne.getTime())/1000f) + " seconds");
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
