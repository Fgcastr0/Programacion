package Ejercicio01.entero;

import java.util.Scanner;

public class Ejercicio01enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        double[] calificaciones = new double[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        double sumaCalificaciones = 0;

        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / cantidadEstudiantes;

        System.out.println("El promedio de calificaciones es: " + promedio);
    }
}