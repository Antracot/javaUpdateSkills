package javaDataType;

import java.util.Scanner;

public class integerCombiner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");

        String numbValue = scanner.next();
        String[] parts = numbValue.split("");
        int sum = 0;
        for(int i=0; i < parts.length; i++){
            sum = sum + Integer.parseInt(parts[i]);
        }
        System.out.println("The sum of all digits in " + numbValue +" is " + sum );
    }
}

