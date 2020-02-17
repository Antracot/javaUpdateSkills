package javaDataType;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FahrenheitToCelsiusConvector{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fahrenheit temperature: ");

        String fahrenheitValue = scanner.next();
        double celsiusValue = (Double.valueOf(fahrenheitValue) - 32) / 1.8;
        String celsiusResult = new DecimalFormat("##.00").format(celsiusValue);

        System.out.println(fahrenheitValue + " degree Fahrenheit is equal to " + celsiusResult + " in Celsius");
    }

}
