package bit_manipulation;

import java.util.Scanner;

/**
 * Bits
 */

public class Bits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //GET BIT
        System.out.println("This is get bit system");

        System.out.print("Which number do you want ot GET BIT: ");
        int n = sc.nextInt(); // The binary of 5 is 0101

        System.out.print("Enter Position you want to get: ");
        int pos = sc.nextInt(); //This is the position where we want to get the bit

        int bitMast = 1<<pos;

        if((bitMast & n) == 0){
            System.out.println("Bit of "+ n+" in position "+ pos+ " was ZERO");
        }else{
            System.out.println("Bit of "+ n+" in position "+ pos+ " was ONE");
        }

        //SET BIT
        System.out.print("Which number do you want ot SET BIT: ");
        int m = sc.nextInt(); // The binary of 5 is 0101

        System.out.print("Enter Position you want to get: ");
        int pos2 = sc.nextInt(); //This is the position where we want to get the bit
        int bm = 1<<pos2;
        int result = bm | m;
        System.out.println("The SET BIT result of "+ m +" is:" + result);

    }
}