package com.adnan;

import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();

        String department = in.next();

        switch (empId) {
//            case 1:
//                System.out.println("Adnan Khan");
//                break;
//            case 2:
//                System.out.println("Musaib Khan");
//                break;
            //enhanced
            case 1 -> System.out.println("Adnan Khan");
            case 2 -> System.out.println("Musaib Khan");
            case 3 -> {
                System.out.println("");
//                switch(department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "Designing":
//                        System.out.println("Designing Department");
//                        break;
//                    default:
//                        System.out.println("No department assigned");
//                        break;
//                }
                //enhanced
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Designing" -> System.out.println("Designing Department");
                    default -> System.out.println("No department assigned");
                }
            }
            default -> System.out.println("enter correct EmpId");
        }
    }
}
