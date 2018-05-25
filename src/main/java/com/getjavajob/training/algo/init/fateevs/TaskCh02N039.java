package com.getjavajob.training.algo.init.fateevs;

import java.util.Scanner;

public class TaskCh02N039 {
    public static void main (String args[]){

        int h , m , s;
        double sTime; // time in second
        double sDegrees = 0.00833; // degree per second
        double angle;

        h = 10; m = 0; s = 0;

/*        System.out.print("Введите значение времени часы(h): ");
        Scanner in = new Scanner(System.in);
        h = in.nextInt();

        System.out.print("Введите значение времени минуты(m): ");
        Scanner in = new Scanner(System.in);
        m = in.nextInt();

        System.out.print("Введите значение времени секунды(s): ");
        Scanner in = new Scanner(System.in);
        s = in.nextInt();*/

        if ( h < 12 ) {
            sTime = h*3600 + m*60 + s;
            angle = sTime*sDegrees;
            System.out.println("Угол = " +angle);
        }
        else {
            h = h - 12;
            sTime = h*3600 + m*60 + s;
            angle = sTime*sDegrees;
            System.out.println("Угол = " +angle);
        }
    }
}
