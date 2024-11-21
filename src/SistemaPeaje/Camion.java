package SistemaPeaje;

/**
 * Esta clase denominada Camion modela un tipo especifico
 * de vehiculo que llega a un peaje. Tiene un atributo para representar el numero de 
 * ejes del camion y un atributo estatico para representar su valor
 * del peaje en $5000 por cada eje
 * @version 1.0/2020
 */

public class Camion extends Vehiculo {
    //atributo estatico que representa el valor del peaje a pagar por un camion
    static int valorPeajeEje = 50;
    //atributo que representa el numero de ejes del camion
    int numeroEjes;

    /**
     * Constructor de la clase Camion
     * @param placa Parametro que define la placa del camion
     * @param numeroEjes Parametro que define el numero de ejes del camion
     */

    Camion(String placa, int numeroEjes) {
        super(placa); // invoca al constructor de la clase padre
        this.numeroEjes = numeroEjes;
    }

    /**
     * Metodo que devuelve el valor del peaje del camion
     * @return El numero de ejes del camion
     */

    public int getValorPeajeEje() {
        return valorPeajeEje;
    }

    /**
     * Metodo que establece el valor del peaje del camion
     * @param valorPeajeEje Parametro que define el valor del peaje del camion
     */

    static void setValorPeajeEje(int valorPeajeEje) {
        Camion.valorPeajeEje = valorPeajeEje;
    }
    
    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Numero de ejes = " + numeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}
