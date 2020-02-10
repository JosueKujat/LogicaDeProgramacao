package Kujat.Josue.EstruturasCondicionais.SwitchCase;

public class ImprimirConta {
    public static void main(String[] args) {
        String conta = "Conta Poupança";
        switch (conta) {
            case "Conta Poupança":
                System.out.println("0.05%");
                break;
            case "Conta Corrente":
                System.out.println("0.02%");
                break;
            case "Conta Investimento":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("Conta inválida");

        }

    }
}
