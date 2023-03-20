package threadPool;

public class ThreadPoll extends Thread {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();


//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Override
    public void run() {
        System.out.println("Захватываем монитор lock1");
        synchronized (ThreadPoll.lock1) {
            System.out.println("Монитор lock1 захвачен");
            System.out.println("Захватываем lock2");
            synchronized (ThreadPoll.lock2) {
                System.out.println("мониторы lock1 и lock2 захвачены");
            }
        }
    }

}

class ThreadPool2 extends Thread {
    @Override
    public void run() {
        System.out.println("Захватываем монитор lock2");
        synchronized (ThreadPoll.lock2) {
            System.out.println("Монитор lock2 захвачен");
            System.out.println("Захватываем lock1");
            synchronized (ThreadPoll.lock1) {
                System.out.println("мониторы lock1 и lock2 захвачены");
            }
        }
    }
}
