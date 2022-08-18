package com.cydeo.test;

interface Runnable {
    void run();
    //void shutDown();
}

public class Main {

    public static void main(String[] args) {

        run(() -> System.out.println("System is running..."));

    }

    public static void run(Runnable runnable) {
        runnable.run();
    }

}