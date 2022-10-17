package Threads1;

public class ThreadTest {
    public static void main(String[] args) {
        //Task Object
        MyTask task = new MyTask();
        //Worker object
        Thread worker1 = new Thread(task, "First Thread");
        Thread worker2 = new Thread(task, "Second Thread");
        worker1.start();
        worker2.start();


    }
}
