/**
 * Objective
 * In this challenge, we review some basic concepts that will get you started with this series.
 * You will need to use the same (or similar) syntax to read input and write output in challenges throughout HackerRank.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * To complete this challenge, you must save a line of input from `stdin` to a variable, print "Hello, World." on a single line,
 * and finally print the value of your variable on a second line.
 */

package HR30daysJava.Day00;

import java.util.Scanner;

public class Main {
    /**
     * 1. use the Scanner class to read from stdin
     * 2. read a line of input and save it to a variable
     * 3. close the scanner
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // ( 1 )
        String inputString = scan.nextLine(); // ( 2 )
        scan.close(); // ( 3 )

        System.out.println("Hello, World.");

        System.out.println(inputString);
    }
}