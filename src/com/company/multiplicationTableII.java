package com.company;

import java.util.Scanner;

public class multiplicationTableII {

    public static int getInputFromStandardIn() {
        // To read the n value for producing the MultiplicationTable (n x n):
        Scanner userInput = new Scanner(System.in);
        System.out.println("Dear user, please enter a number, and I will compute a multiplication table for you: ");
        return userInput.nextInt();
    }

    public static void printMultiplicationTable(int n) {
        // To generate the multiplication table:
        System.out.println("You typed in " + n + " . Here is the multiplication table: ");
        int[][] multiplicationTable =new int[n][n];
        int maxLenght = String.valueOf(n*n).length();
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                int element = multiplicationTable[i][j]=(i+1)*(j+1);
                System.out.print((" ".repeat(maxLenght+1-(String.valueOf(element).length()))) + element);
            }
            System.out.print("\n");
        }
    }

    public static void survey() {
        System.out.println("Happy? (y/n)");
        Scanner userInput = new Scanner(System.in);
        String survey = userInput.next();
        if (survey.equals("y")){
            System.out.print("I am glad that you are happy with the results");
        } else if (survey.equals("n")){
            System.out.print("Oh! really? please let me know how I can help you further. You can contact me via Github. my user is RouhallahAfsharpour");
        } else{
            System.out.print("Sorry, I didn't get your point!");
        }
    }

    public static void run() {
        int n = getInputFromStandardIn();
        printMultiplicationTable(n);
        survey();
    }

    public static void main(String[] args) {
        System.out.println("Testing MultiplicationTable II program");
        run();
    }
}
