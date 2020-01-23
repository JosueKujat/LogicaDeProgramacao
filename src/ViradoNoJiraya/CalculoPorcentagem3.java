package ViradoNoJiraya;

public class CalculoPorcentagem3 {
    public static void main(String[] args) {
        float salario = 4200.50f;
        float calc;
        String saber;
        if (salario > 4500) {
            calc = salario * 0.3f;
            saber = "é 30%";
        } else {
            calc = salario * 0.15f;
            saber = "é 15%";
        }
        System.out.println("O valor final é: " + calc + ", ou seja, " + saber);
    }
}