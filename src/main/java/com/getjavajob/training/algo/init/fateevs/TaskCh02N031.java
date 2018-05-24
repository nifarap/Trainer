package com.getjavajob.training.algo.init.fateevs;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TaskCh02N031 {
    public static void main (String args[]){
        int x = 0;

        System.out.print("Введите число от 100 до 999: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        System.out.println("Вы ввели число " + x);

        int a, b, c, y;

        a = x % 10;
        b = (x - a)/10 % 10;
        c = (x - (x % 100)) / 100;

        y = c*100 + a*10 + b;

        System.out.println("Изначальное число = " +y);
    }
}
