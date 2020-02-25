package Kujat.Josue.EstruturasCondicionais.arrays;

import java.util.Scanner;

public class ExercicoArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scn = new Scanner(System.in);
        String cont = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            array1[i] = scn.nextInt();
            System.out.println("Vetor 2, posição " + i + ": ");
            array2[i] = scn.nextInt();
            array3[i] = array1[i] * array2[i];
            cont+= array3[i] + " ";
        }
        System.out.println(cont);
    }
}
