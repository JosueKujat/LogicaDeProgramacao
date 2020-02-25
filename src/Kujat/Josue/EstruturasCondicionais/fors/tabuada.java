package Kujat.Josue.EstruturasCondicionais.fors;

public class tabuada {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada de " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }
    }
}
