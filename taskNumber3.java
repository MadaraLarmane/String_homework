package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class taskNumber3 {

    public static void taskNumber3_1() {
        String name = "John";
        Pattern pattern = Pattern.compile("[A-Z][a-z]");
        Matcher matcher = pattern.matcher(name);
        boolean matcherFind = matcher.find();
        if (matcherFind) {
            System.out.println("Correct!");
        } else {
            System.out.println("Error, please choose only letters!");
        }
    }

    public static void taskNumber3_2() {
        String surname = "s20surname";
        Pattern pattern = Pattern.compile("[a-z]{1}[0-9]{2}[a-z]");
        Matcher matcher = pattern.matcher(surname);
        boolean matchFind = matcher.find();
        if (matchFind) {
            System.out.println("Correct!");
        } else {
            System.out.println("Error, please choose: first is letter, 2 digits and unlimited letters");
        }
    }

    public static void taskNumber3_3() {
        String personCodeOfLatvian = "121200-11311";
        Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
        Matcher matcher = pattern.matcher(personCodeOfLatvian);
        boolean matchFind = matcher.find();
        if (matchFind) {
            System.out.println("Correct!");
        } else {
            System.out.println("Error, please choose 6 digits, after that - sign, after that 5 digits");
        }
    }

    public static void main(String[] args) {
        taskNumber3_1();
        taskNumber3_2();
        taskNumber3_3();
    }
}
