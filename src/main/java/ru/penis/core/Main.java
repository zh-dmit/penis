package ru.penis.core;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String pole[][] = new String[3][3];

          for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                if (pole[i][j]== null){
                    pole [i][j] = "_"; }
            }
        }
        System.out.println(" 0|0|1|2|");
        System.out.println(" 0|" + pole[0][0] + "|" + pole[0][1] + "|" + pole[0][2] + "|");
        System.out.println(" 1|" + pole[1][0] + "|" + pole[1][1] + "|" + pole[1][2] + "|");
        System.out.println(" 2|" + pole[2][0] + "|" + pole[2][1] + "|" + pole[2][2] + "|");
        for (int i = 0; i<9;i++) {
            System.out.println("Игрок введите координаты поля и X или O ");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a>2||a<0||b>2||b<0){
                System.out.println("Значение за пределами координат ! Попробуй еще");
                System.exit(0);
            }
            pole[a][b] = scan.next();
            if (pole[a][b].equals("X")||pole[a][b].equals("O")){}
            else{
                System.out.println("Введена не та буква ! Попробуй еще");
                System.exit(0);
            }
            System.out.println(" 0|0|1|2|");
            System.out.println(" 0|" + pole[0][0] + "|" + pole[0][1] + "|" + pole[0][2] + "|");
            System.out.println(" 1|" + pole[1][0] + "|" + pole[1][1] + "|" + pole[1][2] + "|");
            System.out.println(" 2|" + pole[2][0] + "|" + pole[2][1] + "|" + pole[2][2] + "|");
            if (((pole[0][0].equals(pole [0][1]))&(pole[0][1].equals(pole [0][2])))&(pole[0][0].equals("X")||pole[0][0].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[1][0].equals(pole [1][1]))&(pole[1][1].equals(pole [1][2])))&(pole[1][0].equals("X")||pole[1][0].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[2][0].equals(pole [2][1]))&(pole[2][1].equals(pole [2][2])))&(pole[2][0].equals("X")||pole[2][0].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[0][0].equals(pole [1][0]))&(pole[1][0].equals(pole [2][0])))&(pole[0][0].equals("X")||pole[0][0].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[0][1].equals(pole [1][1]))&(pole[1][1].equals(pole [2][1])))&(pole[0][1].equals("X")||pole[0][1].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[0][2].equals(pole [1][2]))&(pole[1][2].equals(pole [2][2])))&(pole[0][2].equals("X")||pole[0][2].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[0][0].equals(pole [1][1]))&(pole[1][1].equals(pole [2][2])))&(pole[0][0].equals("X")||pole[0][0].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }
            if (((pole[0][2].equals(pole [1][1]))&(pole[1][1].equals(pole [2][0])))&(pole[0][2].equals("X")||pole[0][2].equals("O"))){
                System.out.println("Win!");
                System.exit(0);
            }

        }
    }

}
