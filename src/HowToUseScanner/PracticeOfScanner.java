package HowToUseScanner;

import java.util.Scanner;

public class PracticeOfScanner {
    static Scanner nameOfScanner = new Scanner(System.in); /*this Scanner Class can be under main method,
                                                            but I put it above the main method.
                                                            If u wanna put it above, u need to add
                                                            "static" first. */

    public static void main(String[] args) {
        System.out.print("What is your name?: ");
        String name = nameOfScanner.nextLine(); //I am asking what is "name"

        System.out.println(name);
    }
}
