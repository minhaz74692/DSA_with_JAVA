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

        int bitMast = 1<<pos; //THIS IS BIT MASK METHOD

        if((bitMast & n) == 0){
            System.out.println("Bit of "+ n+" in position "+ pos+ " was ZERO");
        }else{
            System.out.println("Bit of "+ n+" in position "+ pos+ " was ONE");
        }

        //SET BIT
        System.out.print("Which number do you want ot SET BIT: ");
        int m = sc.nextInt(); // The binary of 5 is 0101

        System.out.print("Enter Position you want to SET: ");
        int pos2 = sc.nextInt(); //This is the position where we want to get the bit
        int bm = 1<<pos2;
        int result = bm | m;
        System.out.println("The SET BIT result of "+ m +" is:" + result);

        //clear bit
        System.out.println("This is clear bit method ");
        System.out.print("Which number do you want ot CLEAR BIT: ");
        int m3 = sc.nextInt(); // The binary of 5 is 0101

        System.out.print("Enter Position you want to CLEAR: ");
        int pos3 = sc.nextInt(); //This is the position where we want to get the bit
        int bm3 = 1<<pos3;
        int result3 = ~bm3 & m3;
        System.out.println("The CLEAR BIT result of "+ m3 +"at position "+ pos3 + " is:" + result3);
    }
}