import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {



    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{5,60}"); //valida que tenga minusculas, mayusculas y sea minimo de 5 a 10 caracteres
        Matcher match = pattern.matcher("Esta es una contrasenia");
        if(match.find()){
            System.out.println("Es válida");
        }
        else {
            System.out.println("No es válida");
        }
    }
}
