package com.company;

import java.util.*;

public class taskNumber2 {
    static String myString = "Climb mountains not so the world can see you, but so you can see the world";

    public static void taskNumber2_1() {
        String myString = "Climb mountains not so the world can see you, but so you can see the world";
        System.out.println("Words in a sentence: ");
        int count = 0;
        char ch[] = new char[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            ch[i] = myString.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        System.out.println(count);
    }

    public static void taskNumber2_2() {
        var str = "Climb mountains not so the world can see you, but so you can see the world";
        var res = str.split(" ");
        System.out.println("'the' words in the sentence: ");
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            boolean b = res[i].matches("(?i).*the.*");
            if (b) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void taskNumber2_3() {
        var str = "Climb mountains not so the world can see you, but so you can see the world";
        var res = str.split(" ");
        System.out.println("Words that consists letter 's': ");
        int count = 0;
        for (int i=0; i<res.length;i++){
           boolean b = res[i].matches("(?i).*s.*");
           if (b) {
               count++;
           }
        }
        System.out.println(count);
    }

    public static void taskNumber2_4(){
        System.out.println("Words that are repeated: ");
        List<String> list = Arrays.asList(myString.split(" "));
        Set<String> repeatedWords = new HashSet<String>(list);
        for (String words : repeatedWords) {
            if (Collections.frequency(list, words) > 1){
                System.out.println(words);
            }
        }
    }

    public static void taskNumber2_5(){

        String replaceString = myString.replace("you", "You");
        System.out.println("Original string: "+myString);
        System.out.println("New string: "+replaceString);
    }

    public static void main(String[] args) {
        taskNumber2_1();
        taskNumber2_2();
        taskNumber2_3();
        taskNumber2_4();
        taskNumber2_5();
    }


}
