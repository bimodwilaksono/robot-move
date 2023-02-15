package com.enigma.enumeration;

public enum Compass {
    E, N, W, S;
    private static Compass[] values = values();
    public static Compass getCompass(int ordinal){
        if (ordinal < 0 ){
            return values[ordinal + values.length];
        }
        if (ordinal >= values.length){
            return values[ordinal- values.length];
        }
        return values[ordinal];
    }
}
