import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String cadena;
    private int longitud;

    public Password(String regex) {
        this.cadena = regex;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) { //para establecer el atributo longitud
        this.longitud = longitud;
    }

    public void setValue(String pwd) {
        try {
            Pattern pat = Pattern.compile(this.cadena);
            Matcher mat = pat.matcher(pwd);
            mat.matches();
            System.out.println("Contraseña válida");
            setCadena(pwd);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }


}

