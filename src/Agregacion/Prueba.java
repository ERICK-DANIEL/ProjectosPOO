package Agregacion;

public class Prueba {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Carpeta", "Carpeta anillada metalica", 1000);
        Producto producto2 = new Producto(2, "Tinta", "Tinta china color negro", 3000);
        Producto producto3 = new Producto(3, "Cinta pegante", "Cinta de color transparente", 800);
        Producto producto4 = new Producto(4, "Cartulina", "Pliego de cartulina 60x40cms", 600);

        Orden orden = new Orden(1);
        orden.añadirItem(1, 5, producto1);
        orden.añadirItem(2, 3, producto2);
        orden.añadirItem(3, 2, producto3);
        orden.añadirItem(4, 4, producto4);

        orden.calcularTotalOrden();
        System.out.println(orden);
    }
}
