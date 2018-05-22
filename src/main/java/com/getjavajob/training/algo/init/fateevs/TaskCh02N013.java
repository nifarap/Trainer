package com.getjavajob.training.algo.init.fateevs;

import java.lang.Math;

public class TaskCh02N013 {
    public int random_number;

    public static void main(String args[]){
        int a = 100;
        int mirror = 0;

        int random_number = a + (int)(Math.random() * a);
        System.out.println("Число между 200 и 100 = " +random_number);

        while (random_number != 0) {
            mirror = mirror * 10 + (random_number % 10);
            random_number = random_number / 10;
        }
        System.out.println("Зеркальное отображение = " +mirror);
    }
}