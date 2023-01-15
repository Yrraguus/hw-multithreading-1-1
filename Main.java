// https://github.com/netology-code/jd-homeworks/blob/master/multithreading/task1/README.md

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки");

        MyThread myThread1 = new MyThread(threadGroup, "поток 1");
        myThread1.start();
        MyThread myThread2 = new MyThread(threadGroup, "поток 2");
        myThread2.start();
        MyThread myThread3 = new MyThread(threadGroup, "поток 3");
        myThread3.start();
        MyThread myThread4 = new MyThread(threadGroup, "поток 4");
        myThread4.start();

        Thread.sleep(15000);
        System.out.println("Завершаю все потоки");
        threadGroup.interrupt();
    }
}