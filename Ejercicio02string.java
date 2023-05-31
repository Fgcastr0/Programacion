package Ejercicio02string;

public class Ejercicio02string {
    public static String encontrarPalabraLarga(String[] palabras) {
        String palabraLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > palabraLarga.length()) {
                palabraLarga = palabra;
            }
        }

        return palabraLarga;
    }

    public static void main(String[] args) {
        String[] arrayPalabras = {"ferrocarril", "programacion", "auto", "implementacion", "silla"};

        String palabraMasLarga = encontrarPalabraLarga(arrayPalabras);

        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}
