package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pole[] = new int[9];
        int i = 0;
        while (i < 9){
            System.out.println("Ход игрока 1, введите 1(x) или 2(o) ");
            Scanner scan = new Scanner(System.in);
            pole[i] = scan.nextInt();
            i++;
            for (int v:pole)
            System.out.print(v+"|");
            if(i==3) break;
            System.out.println("Ход игрока 2, введите 1(x) или 2(o) ");
            pole[i] = scan.nextInt();
            for (int v:pole)
            System.out.print(v+"|");
            i++;


        }
        for (int v:pole)
        System.out.print(v);




	// write your code here
    }
}
