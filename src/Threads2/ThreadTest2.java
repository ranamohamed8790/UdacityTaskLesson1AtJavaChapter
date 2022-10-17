package Threads2;

import Threads1.MyTask;

public class ThreadTest2 {
    public static void main(String[] args) {
        //Worker and Task object
        Thread worker1 = new Thread( "First Thread");
        Thread worker2 = new Thread("Second Thread");
        worker1.start();
        worker2.start();
    }
}

