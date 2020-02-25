package Kujat.Josue.EstruturasCondicionais.whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {

            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");
            opcao = scn.nextInt();

        }
        System.out.println("Fim");
    }
}
