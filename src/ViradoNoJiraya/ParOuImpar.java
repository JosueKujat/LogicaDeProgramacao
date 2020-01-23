package ViradoNoJiraya;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero = 124;

        if ((numero % 2) == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
/*
Quando usamos o resto ( % ) ele pega o resto da divisao.
exemplo: 124 o resto é 0, ou seja, ele é par.
exemplo 2: 243 o resto é 3, ou seja, ele é ímpar.
 */