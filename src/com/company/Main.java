package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pole[][] = new int[3][3];
        System.out.println("Игрок 1 введите координаты поля: ");
        System.out.println(" 0|0|1|2|");
        System.out.println(" 0|_|_|_|");
        System.out.println(" 1|_|_|_|");
        System.out.println(" 2|_|_|_|");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        pole [a][b] = scan.nextInt();
        System.out.println(" 0|0|1|2|");
        System.out.println(" 0|"+pole[0][0]+"|"+pole[0][1]+"|"+pole[0][2]+"|");
        System.out.println(" 1|"+pole[1][0]+"|"+pole[1][1]+"|"+pole[1][2]+"|");
        System.out.println(" 1|"+pole[2][0]+"|"+pole[2][1]+"|"+pole[2][2]+"|");


    }

}
