package EjerciciosTarde.Ejercicio2;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        System.out.println(circulo);
        System.out.println("Area: " + circulo.area());

        Triangulo triangulo = new Triangulo(3.0, 4.0);
        System.out.println(triangulo);
        System.out.println("Area: " + triangulo.area());

        Rectangulo rectangulo = new Rectangulo(5.0, 2.0);
        System.out.println(rectangulo);
        System.out.println("Area: " + rectangulo.area());

        ArrayList<FiguraGeometrica> figurasGeometricas = new ArrayList<>();
        figurasGeometricas.add(circulo);
        figurasGeometricas.add(triangulo);
        figurasGeometricas.add(rectangulo);

        double areaPromedio = AreaPromedio.areaPromedio(figurasGeometricas);
        System.out.println("Area promedio: " + areaPromedio);
    }
}
