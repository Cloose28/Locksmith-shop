package com.nenazvan.services;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Function;

/**
 * Created by artem on 2/27/16.
 */
public class Controller {
    /** */
    private List<Order> orderList = new ArrayList<>();
    private List<Service> serviceList = new ArrayList<>();

    public Controller() {
        orderList = getListFromFile("orders.txt",
                Order::fromString);
        serviceList = getListFromFile("service.txt",
                (Service::fromString));

        orderList.stream().forEach(System.out::println);
        orderList.stream().filter((Order order) -> order.getName().equals("Вася")).forEach(System.out::println);
        orderList.stream()
                .filter((Order order) -> order.getName().equals("Вася"))
                .map(Order::getName)
                .forEach(System.out::println);
    }

    private <T> List<T> getListFromFile(String fileName, Function<String, T> createObjectFromString) {
        ArrayList<T> list = new ArrayList<>();

        list.add(createObjectFromString.apply("asdfand"));

        return list;
    }

//    private <T> List<T> getListFromFile(String fileName) {
//        ArrayList<T> list = new ArrayList<>();
//       isOrder();
//
//        return list;
//    }

//    private <T> boolean isOrder() {
//        Class type = ((T) new Object()).getClass();
//        if (type.isInstance(new Order())) {
//
//        }
//        return false;
//    }
}
