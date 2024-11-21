package Agregacion;
import java.util.*;

class Orden {
    private int identificador;
    private Vector itemsPedido;

    public Orden(int identificador) {
        this.identificador = identificador;
        itemsPedido = new Vector();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int calcularTotalOrden() {
        int totalOrden = 0;
        for (int i = 0; i < itemsPedido.size(); i++) {
            LineaPedido linea = (LineaPedido) itemsPedido.elementAt(i);
            totalOrden = totalOrden + linea.calcularSubtotalLineaPedido();
        }
        return totalOrden;
    }

    public String toString() {
        return "Orden[id = " + identificador +"] \n" + "Items del pedido\n" + itemsPedido + "\n Total orden = $" + calcularTotalOrden();
    }

    public void añadirItem(int identificador, int cantidad, Producto producto) {
        LineaPedido linea = new LineaPedido(identificador, cantidad, producto);
        itemsPedido.add(linea);
    }
}