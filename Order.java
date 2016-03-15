package com.nenazvan.services;

import java.time.LocalDateTime;

/**
 * Created by artem on 2/27/16.
 */
public class Order {
    /** Date and time. */
    private LocalDateTime orderDate;
    /** The full name of the customer*/
    private String customerName;


//    /** Client's name. */
//    private String name;
//    /** Client's surname. */
//    private String surname;
//    /** Client's patronymic. */
//    private String patronymic;
    /** Cost of order in roubles*/
    private int cost;
    /** Phone customer (example 8980..) */
    private String phoneNumber;
    /** The full name of the master*/
    private String masterName;

}
