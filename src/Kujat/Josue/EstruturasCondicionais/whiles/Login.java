package Kujat.Josue.EstruturasCondicionais.whiles;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        final String login = "josue";
        final String senha = "123456";
        boolean exibeLogin = true;
        Scanner scn = new Scanner(System.in);
        while (exibeLogin) {
            System.out.println("Digite seu login");
            String loginDigiado = scn.nextLine();
            System.out.println("Digite sua senha");
            String senhaDigitado = scn.nextLine();
            if (login.equals(loginDigiado) && senha.equals(senhaDigitado)) {
                System.out.println("Acesso concedido");
                exibeLogin = false;
                break;
            }
            System.out.println("Acesso negado");

        }
    }
}
