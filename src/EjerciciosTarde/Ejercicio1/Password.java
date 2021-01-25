package EjerciciosTarde.Ejercicio1;

public abstract class Password {
    protected String regex;
    protected String value;

    public Password() {

    }

    public Password(String regex) {
        this.regex = regex;
    }

    public void setValue(String password) throws LaContraseniaNoCumpleException {
        if (password.matches(this.regex)){
            this.value = password;
        }
        // cambiar por Excepcion hecha por mi
        else throw new LaContraseniaNoCumpleException("La contraseña no cumple con los requisitos");
    }

    public String getValue() {
        return value;
    }

    public String getRegex() {
        return regex;
    }
}
