package com.mycompany.sistemalogisticaenvios.model;

public abstract class Paquete {

    private int idPaquete;
    private double peso;
    private String direccionDestino;
    private final double costoBase = 100.80;
    private EstadosEnvio statusEnvio;

    public Paquete(int idPaquete, double peso, String direccionDestino) {
        this.idPaquete = idPaquete;
        this.peso = peso;
        this.direccionDestino = direccionDestino;
        this.statusEnvio = null;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public EstadosEnvio getStatusEnvio() {
        return statusEnvio;
    }

    public void setStatusEnvio(EstadosEnvio statusEnvio) {
        this.statusEnvio = statusEnvio;
    }

    public abstract double calcularCostoTotal();

}
