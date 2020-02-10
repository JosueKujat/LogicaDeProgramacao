package Kujat.Josue.EstruturasCondicionais.whiles;

import java.util.Scanner;

public class ExercicioWhiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um Numero");
        int numero = input.nextInt();
        int i = 0;
        while (i <= numero){
            if ((i % 2) != 0){
                System.out.println("i = " + i);
            }i++;
        }
    }
}
