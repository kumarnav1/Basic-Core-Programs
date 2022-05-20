package com.bl.functionalprograms;

public class WindChill {
    public static void main(String[] args) {

        double windChill;
        double temperature = Double.parseDouble(args[0]);
        double windSpeed = Double.parseDouble(args[1]);

        if (!(temperature < 50)) {
            System.out.println("Invalid input, value of temperature should be less than 50");
            return;
        }
        if (!(windSpeed < 120 && windSpeed > 3)) {
            System.out.println("Invalid input, value of wind speed should be in between 3 and 120");
            return;
        }
        windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
        System.out.println("Wind Chill is = " + windChill);
    }
}