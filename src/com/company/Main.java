package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        //int[] arr = {};
        int[] arr = {1, 2, 3, 4, 5};
        for (int number : arr) { //for (int i = 0; i < arr.length; i++)
            sum += number;
        }
        System.out.println("Сумма с помощью for: " +sum);
        sum = 0;
        int i = 0;
        while (i < arr.length){
            sum += arr[i];
            i++;
            /*if (i>=arr.length){
                i = 0;
                break;
            }*/

        }
        System.out.println("Сумма с помощью while: " + sum);
        sum = 0;
        i = 0;
        if (arr.length > 0) { //статичный массив, а может быть пустой
            do {
                sum += arr[i];
                i++;
            } while (i < arr.length);

        } else System.out.println("Пустой");
        System.out.println("Сумма с помощью do while: " + sum);



    }
}
