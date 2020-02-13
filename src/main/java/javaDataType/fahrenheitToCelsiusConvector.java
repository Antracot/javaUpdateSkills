package javaDataType;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class fahrenheitToCelsiusConvector {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fahrenheit temperature: ");

        String temperatureFahrenheit = scanner.next();
        double temperatureCelsius = (Double.valueOf(temperatureFahrenheit) - 32) / 1.8;
        System.out.println(new DecimalFormat("##.00").format(temperatureCelsius));
    }
}
