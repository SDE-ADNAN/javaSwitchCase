package com.adnan;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit  = in.next();

        switch (fruit) {
            case "Apple" -> System.out.println(" a sweet red fruit");
            case "Mango" -> System.out.println(" a sweet yellow fruit");
            case "Orange" -> System.out.println(" a sweet orange fruit");
            default -> System.out.println("pls give a valid fruit name");
        }

    }
}
