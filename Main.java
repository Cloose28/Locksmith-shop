package com.nenazvan.services;

import java.util.function.Consumer;

/**
 * Created by artem on 2/27/16.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        testPrint((Void) -> System.out.println("Test"));
    }

    private static void testPrint(Consumer<Void> callable) {
        callable.accept(null);
    }

}
