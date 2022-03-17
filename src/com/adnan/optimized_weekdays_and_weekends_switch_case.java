package com.adnan;

import java.util.Scanner;

public class optimized_weekdays_and_weekends_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();

        // level 2 optimized switch case
//
//        switch(day){
//            case 1 :
//            case 2 :
//            case 3 :
//            case 4 :
//            case 5 :
//                System.out.println("weekday");
//                break;
//            case 6 :
//            case 7 :
//                System.out.println("weekend");
//                break;
//        }

        // level 3 optimized switch case
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}
