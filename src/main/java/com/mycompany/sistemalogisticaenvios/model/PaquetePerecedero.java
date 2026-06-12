package com.mycompany.sistemalogisticaenvios.model;

public class PaquetePerecedero extends Paquete {

    private int diasCaducidad;

    public PaquetePerecedero(int idPaquete, double peso, String direccionDestino, int diasCaducidad) {
        super(idPaquete, peso, direccionDestino);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
    }

    @Override
    public double calcularCostoTotal() {
        if (diasCaducidad <= 4){
            return getCostoBase()+90;
        }
        return getCostoBase();
    }
}
