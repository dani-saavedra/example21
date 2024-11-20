package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        String x = null;
        x.strip();
        System.out.println("Hello world!");
        /*
        Exception in thread "main" java.lang.NullPointerException
	        at org.example.Main.main(Main.java:6)
         */
        /*
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.strip()" because "x" is null
	        at org.example.Main.main(Main.java:6)
         */
        AchRequest request = new AchRequest("daniel", 1, LocalDateTime.now());
        request.fecha();
        request.nombre();
    }
}