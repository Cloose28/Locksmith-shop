package com.nenazvan.services;

import java.time.LocalDateTime;

/**
 * Created by artem on 2/27/16.
 */
public class Order {
    /** Date and time of order.*/
    private LocalDateTime orderDate = LocalDateTime.now();
    /** Date and time calculation.*/
    private LocalDateTime estimatedDate = LocalDateTime.now();

    /** True if the organization*/
    boolean isOrganization;
    /** The full name of the customer*/
    private String customerName;

    /** The name of the product*/
    private String productName;
    /** The cost of order in roubles*/
    private int cost;
    /** Phone customer (example 8980..) */
    private String phoneNumber;
    /** The full name of the master*/
    private String masterName;

    /** True if in action*/
    private boolean isAction;
    /** True if is ready*/
    private boolean isReady;
    /** True if is exerted*/
    private boolean isExerted;

    /** True if the make*/
    private boolean isMake;
    /** True if the repair*/
    private boolean isRepair;
    /** True if the duplicate*/
    private boolean isDuplicate;
    /** True if the search for defects*/
    private boolean isSearchForDefects;






}
