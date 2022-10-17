package Threads1;

 public class MyTask implements Runnable {
     @Override
     public void run() {
         for (int i=1; i <= 100; i ++){
             System.out.println(i +" - " + Thread.currentThread().getName());
             try {
                 Thread.sleep(5);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }

     }
 }
