/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterApp;

/**
 *
 * @author @author Alex, Azhar, Russell and Jayden
 */
public class ConverterFormulas {
    //cm to inch
    public static double cmToInch(double input, int round) {
        double result = input * 0.39370;
        //result = round;
        return result;
    }
    //cm to feet
    public static double cmToFeet(double input, int round) {
        double result = input * 0.032808;
        return result;
    }
    //cm to yards
    public static double cmToYard(double input, int round) {
        double result = input * 0.010936;
        return result;
    }
    //cm to miles
    public static double cmToMile(double input, int round) {
        double result = input * 0.00000621;
        return result;
    }
    //meters to inches
    public static double meterToInch(double input, int round) {
        double result = input * 39.370;
        return result;
    }
    //meters to feet
    public static double meterToFeet(double input, int round) {
        double result = input * 3.2808;
        return result;
    }
    //meters to yards
    public static double meterToYard(double input, int round) {
        double result = input * 1.0936;
        return result;
    }
    //meters to miles
    public static double meterToMile(double input, int round) {
        double result = input * 0.00062137;
        return result;
    }
    //kilometers to inches
    public static double kilometerToInch(double input, int round) {
        double result = input * 39370;
        return result;
    }
    //kilometers to feet
    public static double kilometerToFeet(double input, int round) {
        double result = input * 3280.8;
        return result;
    }
    //kilometers to yards
    public static double kilometerToYard(double input, int round) {
        double result = input * 1093.6;
        return result;
    }
    //kilometers to miles
    public static double kilometerToMile(double input, int round) {
        double result = input * 0.62137;
        return result;
    }
    //cesius to fahrenheit
    public static double celsiusToFahrenheit(double input, int round) {
        double result = (input * 9/5) + 32;
        return result;
    }
}
