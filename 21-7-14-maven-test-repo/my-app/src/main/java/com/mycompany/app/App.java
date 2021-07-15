package com.mycompany.app;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static String hello() {
        return "Hallo Kurs";
    }

    public static int calculateLengthOfString(String text) {
        return text.length();
    }
    public static boolean greater100(int x){
        return x>100;
    }
}
