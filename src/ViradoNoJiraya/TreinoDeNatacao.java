package ViradoNoJiraya;

public class TreinoDeNatacao {
    public static void main(String[] args) {
        int idade = 19;
        String nome = "Josué";
        if (idade < 10){
            System.out.println(nome + " paricipará da categoria Infantil");
        }else if (idade >= 11 && idade <= 15){
            System.out.println(nome + " participará da categoria Juvenil");
        }else if (idade >=16 && idade <=19){
            System.out.println(nome + " paricipará da categoria Pré-Adulto");
        }else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}
