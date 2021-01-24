package EjerciciosTarde.Ejercicio1;

public class PasswordIntermedia extends Password{
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";

    public PasswordIntermedia() {
        this.regex = PASSWORD_REGEX;
    }
}
