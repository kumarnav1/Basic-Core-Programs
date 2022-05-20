package com.bl.functionalprograms;

public class Distance {

    public static void main(String[] args) {

        int x_Point = Integer.parseInt(args[0]);
        int y_Point = Integer.parseInt(args[1]);
        double distance;

        distance = Math.sqrt(Math.pow(x_Point, 2) + Math.pow(y_Point, 2));

        System.out.println("Euclidean distance from (x,y) to the Origin (0,0) is: " + Math.floor(distance * 100.0) / 100.0);
    }
}