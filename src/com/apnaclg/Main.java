package com.apnaclg;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printjava(){
        System.out.println("Hello Java");
    }

    public static void printname(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNum = (int)(Math.random()*100);
        int userNum;
        do{
            System.out.println("Guess my number: ");
            userNum = sc.nextInt();
            if (userNum == myNum) {
                System.out.println("WOW, Your number is correct");
                break;
            }
            else if(userNum > myNum){
                System.out.println("Your number is large, guess smallers number");
            }
            else{
                System.out.println("Your number is small, guess bigger number");
            }
        } while(userNum >= 0);

        printSum(2,3);
        printSum(22,34);
        printname("yuva");
        printname("Shri");
        printjava();
        printjava();
        printjava();

        TRY AND CATCH EXCEPTIONAL HANDLING

        int[] m = {45,23,45};
//        System.out.println(m[5]);  // this will give an exceptional error
//        System.out.println("Hi");  // this will also not be printed

        try{
            System.out.println(m[5]);
        } catch(Exception exception){ //This will not give error and will print the next code part without error
            // Do things after catching
            System.out.println("Hi");
        }
        //BREAK AND CONTINUE

        int i = 0;
        while(true){
            if(i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;

            if(i > 5){
                break;
            }
        }

        int number;
        do{
            System.out.println("Enter a number: ");
            number = sc.nextInt();
            System.out.println("Your number is " + number);
        }while(number >= 0);
        System.out.println("The end");

        int k = 100;
        do {
            System.out.println(k + " N");
            k--;
        }while(k >= 1);

        int ii = 100;
        while(ii >= 1){
            System.out.println(ii + " Hi");
            ii--;
        }

        for(int i = 100; i > 0; i-- ){
            System.out.println(i);
        }

        for(int i = 1; i <= 100; i++ ){
            System.out.println(i);
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Thursday to sunday");
        }

        System.out.print("Enter cash: ");
        int cash = sc.nextInt();
        if (cash < 10){  //Need to use curly braces or blocks inside of it is a multiple line of code
            System.out.println("Cant buy anything");
            System.out.println("Get more cash");
        }
        else if(cash > 10 && cash < 40){
            System.out.println("Can get only one thing");
        }
        else{
            System.out.println("Cam get both");
        }

        int aa = 30;
        int bb = 25;

        if (aa < 50 || bb < 55)
            System.out.println("Atleast one Less than 50");
        else
            System.out.println("Not even one less than 50");

        if (aa < 50 && bb < 55)
            System.out.println("Both Less than 50");
        else
            System.out.println("Both Not less than 50");

        boolean isSunup = true;
        if(isSunup)  //This condition will check for the true statement
            System.out.println("day");
        else
            System.out.println("Night");

        if(!isSunup)  //This condition will check for the false statement
            System.out.println("day");
        else
            System.out.println("Night");

        if(isSunup == true)
            System.out.println("day");
        else
            System.out.println("Night");

        int ae = 30;
        if(ae > 18)
            System.out.println("Can vote");
        else
            System.out.println("Cant vote");

        System.out.print("Please enter you address: ");
        String Add = sc.nextLine();
        System.out.println(Add);

        System.out.print("Input you name: ");
        String nam = sc.next();
        System.out.println(nam);

        System.out.println("Input you age: ");
        float bc = sc.nextFloat();
        System.out.println(bc);

        System.out.println("Input you age: ");
        int agee = sc.nextInt();
        System.out.println(agee);


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

        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
//        + - * / % are all arethematic operatots
        int numb = 1;
        numb = numb + 1;
        numb++;
//        The above is the UNARY operator
        System.out.println(numb);

        int i = 1;
        System.out.println(i++); //This will print and then chnage the value of i
        System.out.println(i);
        System.out.println(++i); //This will change and then print the value of i
        System.out.println(i);

        System.out.println("MATH CLASS in JAVA");

        System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));
        System.out.println(Math.random());
        System.out.println((int)Math.random()); //This will always give 0, so we will multiply it by 100 and then it will give the next two decimal value in int
        System.out.println((int)(Math.random()*100));



    }



}