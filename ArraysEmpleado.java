class Empleado {
    String nombre;
    double salario;
    int antiguedad;

    public Empleado(String nombre, double salario, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public void aplicarAumento(double aumento) {
        this.salario += aumento;
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear objetos Empleado
        Empleado empleado1 = new Empleado("Juan", 3000, 3);
        Empleado empleado2 = new Empleado("María", 4000, 6);
        Empleado empleado3 = new Empleado("Carlos", 3500, 8);
        Empleado empleado4 = new Empleado("Laura", 2500, 2);

        // Crear array de objetos Empleado
        Empleado[] empleados = { empleado1, empleado2, empleado3, empleado4 };

        // Aplicar aumento salarial a empleados con antigüedad superior a 5 años
        double aumento = 0.10; // 10% de aumento
        for (Empleado empleado : empleados) {
            if (empleado.antiguedad > 5) {
                empleado.aplicarAumento(empleado.salario * aumento);
            }
        }

        // Mostrar nombre y salario actualizado de cada empleado
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.nombre + " - Salario: " + empleado.salario);
        }
    }
}