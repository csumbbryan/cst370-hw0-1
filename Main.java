/*
 * INSTRUCTION:
 *     This is a Java staring code for hw0_1.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.

 *     Please DO NOT change the name of the main class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: Program accepts two integers as input, and outputs their Sum and Difference, with difference being in
 * absolute value.
 * Name: Bryan Zanoli
 * Date: 08/31/2024
 */

 import java.util.Scanner;
 import java.lang.Math;
 
class Main 
{
    public static void main(String[] args) {

        // Develop your program here.
        // The following is just a sample statement and and you need to replace it with your code

        int integer1;
        int integer2;
        int sum;
        int difference;

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        
        String[] values = s1.split(" "); 
        integer1 = Integer.valueOf(values[0]);
        integer2 = Integer.valueOf(values[1]);

        sum = integer1 + integer2;
        difference = Math.abs(integer1 - integer2);

        System.out.println("SUM:" + sum);
        System.out.println("DIFF:" + difference);
        scanner.close();
    }
}

