package Kujat.Josue.estudosTrabalho;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        String regex = "\\d";
        String texto = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((texto));
    }
}
