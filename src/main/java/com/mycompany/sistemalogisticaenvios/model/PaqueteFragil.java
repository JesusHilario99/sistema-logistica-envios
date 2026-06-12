package com.mycompany.sistemalogisticaenvios.model;

public class PaqueteFragil extends Paquete {

    private double costoEmbalajeEspecial;

    public PaqueteFragil(int idPaquete, double peso, String direccionEnvio, double costoEmbalajeEspecial) {
        super(idPaquete, peso, direccionEnvio);
        this.costoEmbalajeEspecial = costoEmbalajeEspecial;
    }

    public double getCostoEmbalajeEspecial() {
        return costoEmbalajeEspecial;
    }

    public void setCostoEmbalajeEspecial(double costoEmbalajeEspecial) {
        this.costoEmbalajeEspecial = costoEmbalajeEspecial;
    }

    @Override
    public double calcularCostoTotal() {
        return getCostoBase() + costoEmbalajeEspecial;
    }
}
