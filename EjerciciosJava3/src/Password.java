import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String cadena;
    private String regex;
    private String message;

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Password(String regex) {
        this.cadena = regex;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    protected void setValue(String pwd) {
        try {
            Pattern pat = Pattern.compile(regex);
            Matcher mat = pat.matcher(pwd);
            boolean m = mat.find();
            if (m)
                this.cadena = pwd;
            else
                throw new Exception(this.message);
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



