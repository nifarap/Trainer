package com.getjavajob.training.algo.init.fateevs;

import java.lang.Math;

public class TaskCh01N017 {
    public static void main (String args[]) {
        int x = 1;
        double a = 2.0;
        double b = 3.0;
        double c = 4.0;

        double oEx = Math.sqrt(1 - Math.pow(Math.sin(x), 2));
        double pEx = 1/Math.sqrt((a * Math.pow(x,2)) + b * x + c );
        double rEx = (Math.sqrt(x+1) + Math.sqrt(x-1))/2 * Math.sqrt(x);
        int sEx = Math.abs(x) + Math.abs(x+1);

        System.out.println("Выражение 0 = " +oEx);
        System.out.println("Выражение П = " +pEx);
        System.out.println("Выражение Р = " +rEx);
        System.out.println("Выражение С = " +sEx);
    }
}
