package com.nenazvan.services;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by artem on 2/27/16.
 */
public class Order {
    /** Date and time. */
    private LocalDateTime orderDate;
    /** Client's name. */
    private String name;
    /** Client's surname. */
    private String surname;
    /** Client's patronymic. */
    private String patronymic;
    /** Cost of order in roubles*/
    private int cost;
    /** Phone customer (example 8980..) */
    private String phoneNumber;
    /** Master names*/
    private String masterName;


    public Order(LocalDateTime orderDate, String name, String surname, String patronymic, int cost, String phoneNumber) {
        this.orderDate = orderDate;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.cost = cost;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", cost=" + cost +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static Order fromString(String s) {
        return new Order(null, "", "", "", 0, null);
    }
}
