package javaDataType;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchesToMetersConvector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");

        String inchValue = scanner.next();
        double meterValue = Double.valueOf(inchValue) * 0.0254;
        String meterResult = new DecimalFormat("##.0").format(meterValue);
        System.out.println(inchValue + " inch is " + meterResult + " meters");
    }

}
