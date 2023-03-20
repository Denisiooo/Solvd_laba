package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new ThreadPoll());
//        }
//        executorService.shutdown();
//        executorService.awaitTermination(1, TimeUnit.SECONDS);
//        System.out.println("Main ends");

        ThreadPoll threadPoll = new ThreadPoll();
        ThreadPool2 threadPool2 = new ThreadPool2();
        threadPoll.start();
        threadPool2.start();
    }
}

