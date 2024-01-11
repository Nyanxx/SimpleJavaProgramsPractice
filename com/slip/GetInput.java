package com.slip;

import java.util.Scanner;

public class GetInput {

    // print message and return integer
    public static int getIntegerNumber(String msg){
        Scanner scan = new Scanner(System.in);
        System.out.print(msg);
        return scan.nextInt();
    }

    // return integer
    public static int getIntegerNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.print("> ");
        return scan.nextInt();
    }



}
