package com.ontariotechu.sofe3980U;

import java.util.Scanner;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program:  The entry point of the program. The local time will be printed first,
     *      Then it will create two binary variables, add them and print the result.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String x1 = scanner.nextLine();
        System.out.println("Enter the second binary number: ");
        String x2 = scanner.nextLine();
        Binary bin1=new Binary(x1);
        Binary bin2=new Binary(x2);

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Binary sum= Binary.add(bin1,bin2);
        System.out.println( "The summation is "+sum.getValue());
        System.out.println( "The OR of the numbers is "+Binary.or(bin1,bin2).getValue());
        System.out.println( "The AND of the numbers is "+Binary.and(bin1,bin2).getValue());
        System.out.println("Their result of multiplication is "+Binary.multiply(bin1,bin2).getValue());

        scanner.close();
    }
}
