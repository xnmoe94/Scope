package com.company.Static;

import com.company.AccessModifiers.Account;
import com.company.Static.StaticTest;
import com.company.scopeChallenge.X;

import java.util.Scanner;

public class Main {

    private int multiplier = 7;


    public static void main(String[] args) {
        // write your code here

        StaticTest Firstinstance = new StaticTest("1st Instance");
        System.out.println(Firstinstance.getName() + "is instance number " + StaticTest.getNumInstance());

        StaticTest Secondinstance = new StaticTest("2nd Instance");
        System.out.println(Secondinstance.getName() + " is instance number " + StaticTest.getNumInstance());


        StaticTest Thirdinstance = new StaticTest("3rd Instance");
        System.out.println(Thirdinstance.getName() + " is instance number " + StaticTest.getNumInstance());


    }
}
