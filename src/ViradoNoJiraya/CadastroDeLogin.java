package ViradoNoJiraya;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o usuario");
        String usuario = input.next();

        if (usuario.equals("") || usuario.equalsIgnoreCase("admin")
                || usuario.equalsIgnoreCase("administrador")){
            System.out.println("Usuario Invalido");
        }else {
            System.out.println("Cadastrado com sucesso");
        }
    }
}
