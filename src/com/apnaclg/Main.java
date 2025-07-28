package com.apnaclg;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//     Our first program
        System.out.println("Hello world ");
        System.out.print("hi");
        System.out.println("Namasthe");

//        Variable
        String Name = "Yuva";
        byte age = 30;
//        int phone = 12345678900; this is out of int range so have to store it in long
        long phone = 12345678900L;
        float pi = 31.14F;
        char letter = 'a';
        boolean isAdult = true;
        String Person = "Aman";
        String F = new String("Yuva");
        System.out.println(Person.length());

//        Concatination of string

        String name1 = "Shri";
        String name2 = "Akku";
        String name3 = name1 + name2;
        System.out.println(name3);
        System.out.println(name1 + " and " + name2);
        System.out.println(name1.charAt(0));
        System.out.println(name1.length());
        String name4 = name1.replace('S','s');
        System.out.println(name4);
        String h = "Aman and akki";
        System.out.println(h.substring(0,4));

        int age2 = 30;
        int phy = 23;
        int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 97;
        marks[2] = 99;
        System.out.println(marks);
        System.out.println(marks[0]);
//        System.out.println(marks[3]);
//        This will automatically assign 0 to itself irrespective of any data type of array
//        boolean[] marks = new boolean[4]; this will also assigna default value if the value is not defined or assigned
        System.out.println(marks.length);
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] sub = {98,97,94};
        int[][] finalmarks = {{23,22,34}, {23,43,12}};
        System.out.println(finalmarks[0][2]);

//        this is an example of implicit casting, add int 18 to double
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);
        int p = 100;
//        int fp = p + 18.0; this is an error
//        because we cant convert higher value to lower, but we can store lower value in higher value
//so we need to use explicit casting
        int fp = p + (int)18.0;
        System.out.println(fp);

        final float PI = 3.14F;
//        now we cant change the value of PI as we have final keyword
//        and we use CAPS for CONSTANT value such as PI as an indication that it is a constant

        System.out.println("OPERATORS");



    }



}