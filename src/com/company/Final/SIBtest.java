package com.company.Final;

public class SIBtest {
    public static String owner = null;

    static {
        owner = "tim";
        System.out.println("SIBtest static initialization block called ");
    }

    public SIBtest(){
        System.out.println("SIB Constructor Called ");
    }

    static {
        System.out.println("2nd initialization block called ");
    }


}
