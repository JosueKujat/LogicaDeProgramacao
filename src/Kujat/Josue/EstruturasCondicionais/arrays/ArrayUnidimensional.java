package Kujat.Josue.EstruturasCondicionais.arrays;

import java.util.Scanner;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
//        arrayMulti[0][0] = 22;
//        arrayMulti[0][1] = 11;
//        arrayMulti[0][2] = 54;
//        arrayMulti[1][0] = 44;
//        arrayMulti[1][1] = 56;
//        arrayMulti[1][2] = 76;
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i <arrayMulti.length ; i++) {
            for (int j = 0; j <arrayMulti[i].length ; j++) {
                System.out.println("Digite o valor da posição ["+i+"]["+j+"]");
                arrayMulti[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i <arrayMulti.length ; i++) {
            for (int j = 0; j <arrayMulti[i].length ; j++) {
                System.out.println("["+i+"]["+j+"]= "+arrayMulti[i][j]);
            }
        }
    }


}
