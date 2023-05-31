package Ejercicio01;

public class Ejercicio01 {

        public static void main(String[] args) {

            String[] palabras = {"franco, francesca, florencia, Martina"};
            char caracter ='f';
            int contadorPalabras = 0 ;
            for (String palabra : palabras) {
                if (palabra.charAt(0) == caracter) {
                    contadorPalabras++;

                }

            }
            System.out.println("la cantidad de palabras que comienzan con la letra: " + caracter + " es: " + contadorPalabras);
        }

    }
