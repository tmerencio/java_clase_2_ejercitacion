package EjerciciosTarde.Ejercicio1;

public class PasswordFuerte extends Password{
    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{10,20}$";

    public PasswordFuerte() {
        this.regex = PASSWORD_REGEX;
    }
}
