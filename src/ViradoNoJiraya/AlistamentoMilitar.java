package ViradoNoJiraya;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu sexo: ");
        String sexo = input.next();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();


        if (sexo.equalsIgnoreCase("Masculino") && idade >= 18) {
            System.out.println("Alistamento Obrigatorio!");
        } else if (sexo.equalsIgnoreCase("Masculino") && idade <= 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equalsIgnoreCase("Feminino") && idade >= 18) {
            System.out.print("Deseja se alistar? ");
            String alistarf = input.next();
            if (alistarf.equalsIgnoreCase("Sim")) {
                System.out.println("Alistamento Permitido");
            } else if (alistarf.equalsIgnoreCase("Não")) {
                System.out.println("Não quis se Alistar");
            }
        } else if (sexo.equalsIgnoreCase("Feminino") && idade <= 18) {
            System.out.println("Alistamento não permitido");
        }


    }
}
