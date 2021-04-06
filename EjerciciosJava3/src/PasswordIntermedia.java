public class PasswordIntermedia extends Password{
    public PasswordIntermedia(String regex) {
        super("^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z]){8,16}");
    }
}
