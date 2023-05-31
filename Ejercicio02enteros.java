package Ejercicio02entero;

public class Ejercicio02enteros {
    public static int encontrarMaximo(int[] numeros) {
        int maximo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        int[] arrayNumeros = {30, 100, 1, 15, 3, 6};

        int numeroMaximo = encontrarMaximo(arrayNumeros);

        System.out.println("El número máximo es: " + numeroMaximo);
    }
}

