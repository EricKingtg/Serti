package com.org.mx.t3b.serti.util;

import java.time.Instant;

public class Utilities {

    public static void main(String[] args) {
        getFechaEpoch();
    }

    public static long getFechaEpoch() {
        Instant instant = Instant.now();
        long epochTime = instant.toEpochMilli();
        return epochTime;
    }

}
