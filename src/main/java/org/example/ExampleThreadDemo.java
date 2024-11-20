package org.example;

/*
Java 19
Java 21

 */
public class ExampleThreadDemo {
    public static void main(String[] args) throws InterruptedException {
       /* Thread thread = new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread());
        });
        thread.start();

        */
        /*
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread 1: " + Thread.currentThread());
        });
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread 2: " + Thread.currentThread());
        });

         */
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread " + (finalI + 1) + ": " + Thread.currentThread());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        Thread.sleep(100);
    }
}
