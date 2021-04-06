public class PasswordFuerte extends Password{
    public PasswordFuerte(String regex) {
        super("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$\n");
    }
}
