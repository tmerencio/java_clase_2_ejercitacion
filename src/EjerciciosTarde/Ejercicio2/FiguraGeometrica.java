package EjerciciosTarde.Ejercicio2;

public abstract class FiguraGeometrica {
    public abstract double area();

    public void imprimirArea() {
        System.out.println("Area de la figura: " + area());
    }
}
