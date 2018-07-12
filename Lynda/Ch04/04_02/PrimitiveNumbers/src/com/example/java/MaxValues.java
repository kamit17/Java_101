package com.example.java;

public class MaxValues {

    public static void main(String[] args) {
        byte b = 127;
        short sh = 32767;
        int i = 2147483647;
        long l = (long) 9.2233789;

        //float f = 1f;
        //double d = 1d;
        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("long: " + l);

        if (b < Byte.MAX_VALUE) {
            b++;
        }
        if ( sh < Short.MAX_VALUE)
        {
            sh++;
        }
        if ( l < Long.MAX_VALUE)
        {
            l++;
        }
        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("long: " + l);

    }
}
