package SistemaPeaje;

/*
 * Esta clase es abstracta denominada Vehiculo modela diferentes tipos 
 * de vehiculos que pueden llegar a pasar por un peaje. Un vehiculo posee como unico
 * atrabuto una placa.
 * @version 1.2/2020
 */

abstract public class Vehiculo {
    String placa; // Atributo que representa la placa del vehiculo

    /*
     * Constructor de la clase Vehiculo
     * @param placa parametro que define la placa del vehiculo
     */

    Vehiculo(String placa) {
        this.placa = placa;
    }
}