package com.audreynanual;
import java.text.DecimalFormat;

public class Utilities {
    
    // defining the format style for a double value
    public static DecimalFormat moneyVersion = new DecimalFormat("#,###.##");
    
    public static String moneyFormat(double num) {
        String finalVersion = "PHP " + moneyVersion.format(num);
        if(!finalVersion.contains(".")) {
            finalVersion += ".00";
        }
        return finalVersion;
    }
}