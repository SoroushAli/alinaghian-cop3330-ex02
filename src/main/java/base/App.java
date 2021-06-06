/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

/*
Example Output

What is the input string? Homer
Homer has 5 characters.

Constraints

Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

Challenges

If the user enters nothing, state that the user must enter something into the program.
Implement this program using a graphical user interface and update the character counter every time a key is pressed.
If your language doesn’t have a particularly friendly GUI library, try doing this exercise with HTML and JavaScript instead.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //App myApp = new App();

        String input = readInput();
        int length = getLength(input);
        printOutput(input, length);
    }

    private static void printOutput(String input, int length) {
        System.out.println("What is the input string? " + input + "\n" + input + " has " + length + " characters.");
    }

    private static int getLength(String input) {
        return input.length();
    }

    private static String readInput() {
        return in.next();
    }


}
