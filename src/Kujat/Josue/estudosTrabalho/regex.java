package Kujat.Josue.estudosTrabalho;

public class regex {
    public static void main(String[] args) {
        String x = "Josue anD kujat city blumenau Or seila Not alguma coisa anD lascou oR texto NoT algo";

        x = x.replaceAll("(?i)\\s\\bnot\\b\\s", " NOT ");
        x = x.replaceAll("(?i)\\s\\bor\\b\\s", " OR ");
        x = x.replaceAll("(?i)\\s\\band\\b\\s", " AND ");

        System.out.println(x);

    }

}



