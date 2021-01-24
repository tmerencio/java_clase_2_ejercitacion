package EjerciciosTarde.Ejercicio1;

public class Main {
    public static void main(String[] args) throws Exception {
        Password passwordSimple = new PasswordSimple();
        System.out.println(passwordSimple.getRegex());
        passwordSimple.setValue("abcd1234");
        System.out.println(passwordSimple.getValue());

        Password passwordSimplePersonalizada = new PasswordSimple("(\\d{4})");
        System.out.println(passwordSimplePersonalizada.getRegex());
        passwordSimplePersonalizada.setValue("1234");
        System.out.println(passwordSimplePersonalizada.getValue());

        Password passwordIntermedia = new PasswordIntermedia();
        System.out.println(passwordIntermedia.getRegex());
        passwordIntermedia.setValue("Abcd1234");
        System.out.println(passwordIntermedia.getValue());

        Password passwordFuerte = new PasswordFuerte();
        System.out.println(passwordFuerte.getRegex());
        passwordFuerte.setValue("Abcd1234!+");
        System.out.println(passwordFuerte.getValue());
    }
}
