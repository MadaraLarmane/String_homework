package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void taskNumb1() {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Values that starts with letter C: ");
        int count = 0;
        for (String element : array) {
            if (element.startsWith("C"))
                count++;
        }
        System.out.println(count);
    }

    public static void taskNumber1_2() {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Values that ends with letter E: ");
        int count = 0;
        for (String element : array) {
            if (element.endsWith("e"))
                count++;
        }
        System.out.println(count);
    }

    public static void taskNumber1_3() {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Values with length 5: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 5)
                count++;
        }
        System.out.println(count);
    }

    public static void taskNumber1_4() {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Values that consists of character 'e': ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            Pattern pattern = Pattern.compile("([e])");
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.find()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void taskNumber1_5() {
        String[] array = {"Computer", "Plate", "Chair", "Girl", "Boy",
                "Cat", "Dog", "Shirt", "Determination"};
        System.out.println("Values that consists of subString 'te': ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean b = array[i].matches("(?i).*te.*");
            if (b) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        taskNumb1();
        taskNumber1_2();
        taskNumber1_3();
        taskNumber1_4();
        taskNumber1_5();
    }
}
