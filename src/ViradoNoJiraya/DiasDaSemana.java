package ViradoNoJiraya;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero");
        int dia = input.nextInt();

        if (dia == 1) {
            System.out.println("Segunda feira");
        } else if (dia == 2) {
            System.out.println("Terça");
        } else if (dia == 3) {
            System.out.println("Quarta");
        } else if (dia == 4) {
            System.out.println("Quinta");
        } else if (dia == 5) {
            System.out.println("Sexta");
        } else if (dia == 6) {
            System.out.println("Sabado");
        } else if (dia == 7) {
            System.out.println("Doming");
        } else {
            System.out.println("Numero Invalido");
        }
    }
}
