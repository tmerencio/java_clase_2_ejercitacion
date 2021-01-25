package EjerciciosTarde.Ejercicio1;

public class Main2 {
    public static void main(String[] args) {
        try {
            Password passwordFuerte = new PasswordFuerte();
            System.out.println(passwordFuerte.getRegex());

            passwordFuerte.setValue("Abcd1234!");

            System.out.println(passwordFuerte.getValue());

        } catch (LaContraseniaNoCumpleException e) {
            e.printStackTrace();
        }
    }
}
