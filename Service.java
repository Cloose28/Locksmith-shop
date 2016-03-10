package com.nenazvan.services;

/**
 * Created by artem on 3/5/16.
 */
import java.time.LocalDateTime;

public class Service {
    private LocalDateTime dataTime = LocalDateTime.now();

    public static Service fromString(String s) {
        return new Service();
    }
}
