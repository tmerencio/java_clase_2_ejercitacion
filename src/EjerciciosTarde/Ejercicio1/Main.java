package EjerciciosTarde.Ejercicio1;

public class Main {
    public static void main(String[] args) throws Exception {
        Password passwordSimple = new PasswordSimple();
        passwordSimple.setValue("abcd1234");
        System.out.println(passwordSimple.getValue());

        Password passwordIntermedia = new PasswordIntermedia();
        passwordIntermedia.setValue("Abcd1234");
        System.out.println(passwordIntermedia.getValue());

        Password passwordFuerte = new PasswordFuerte();
        passwordFuerte.setValue("Abcd1234!+");
        System.out.println(passwordFuerte.getValue());

    }
}
