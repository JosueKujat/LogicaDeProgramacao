package Kujat.Josue.EstruturasCondicionais.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;

        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = scn.nextDouble();
            media+=(notas[i]/notas.length);

        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("A media é: " + media);
    }
}
