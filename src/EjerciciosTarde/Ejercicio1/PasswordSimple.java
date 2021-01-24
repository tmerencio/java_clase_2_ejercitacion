package EjerciciosTarde.Ejercicio1;

public class PasswordSimple extends Password{
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z]).{8,20}$";

    public PasswordSimple() {
        this.regex = PASSWORD_REGEX;
    }
}
