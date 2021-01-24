package EjerciciosTarde.Ejercicio2;

import java.util.ArrayList;

public class AreaPromedio {
    public AreaPromedio() {

    }

    public static double areaPromedio(ArrayList<FiguraGeometrica> figurasGeometricas) {
        double sum = 0;

        for (FiguraGeometrica fg : figurasGeometricas) {
            sum += fg.area();
        }

        return sum / figurasGeometricas.size();
    }
}
