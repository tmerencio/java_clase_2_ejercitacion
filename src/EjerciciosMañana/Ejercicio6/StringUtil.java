package EjerciciosMañana.Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtil {
    // Convierte ArrayList<Integer> a ArrayList<String>
    public static ArrayList<String> intArrayToString(int[] array){
        String[] convertedArray = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        return new ArrayList<>(Arrays.asList(convertedArray));
    }

    // Devuelve el número de dígitos del número más grande
    public static int getLongestStringLength(ArrayList<String> array){
        int maxLength = 0;

        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }

        return maxLength;
    }

    // Agrega ceros a la izquierda según cantidad de dígitos
    public static String lpad(String inputString, int length) {
        return String.format("%1$" + length + "s", inputString)
                .replace(' ', '0');
    }

    // Agrega ceros a la derecha según cantidad de dígitos
    public static String rpad(String inputString, int length) {
        return String.format("%1$-" + length + "s", inputString)
                .replace(' ', '0');
    }

    public static String ltrim(String s) {
        return s.stripLeading();
    }

    public static String rtrim(String s) {
        return s.stripTrailing();
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN(String s, char c, int n) {
        int ocurrencias = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                ocurrencias++;
            }
            if(ocurrencias == n){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "Hola mundo";
        int posicion = indexOfN(s, 'o', 2);
        System.out.println("Posicion de la letra: " + posicion);
    }
}
