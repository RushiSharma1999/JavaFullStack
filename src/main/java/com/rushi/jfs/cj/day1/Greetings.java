package com.rushi.jfs.cj.day1;

public class Greetings {
    public static void main(String[] args) {
        String username = "User";
        if(args.length > 0) {
            username = args[0];
        }
        System.out.println("Hi "+ username +",\n\tWelcome to Java world");
    }
}
