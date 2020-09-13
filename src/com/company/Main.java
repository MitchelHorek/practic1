package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -10 + (int) (Math.random()* (10-(-10)+1));
            System.out.print(arr[i] + " ");

        }
        Random random = new Random();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(21) - 10;
            System.out.print(arr[i] + " ");
        }
        for(int i= 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        for (int i= 0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
