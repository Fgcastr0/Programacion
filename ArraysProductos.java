class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }
}

public class Main {
    public static void main(String[] args) {
   
        Producto[] productos = new Producto[3];

 
        productos[0] = new Producto("Camisa", 25.99, 5);
        productos[1] = new Producto("Pantalón", 39.99, 3);
        productos[2] = new Producto("Zapatillas", 59.99, 2);

       
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.nombre + " Total: " + producto.calcularTotal());
        }
    }
}