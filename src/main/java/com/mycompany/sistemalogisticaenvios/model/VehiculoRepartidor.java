package com.mycompany.sistemalogisticaenvios.model;

public class VehiculoRepartidor {
    private int idVehiculo;
    private String nombreConductor;
    private double capacidadMaximaPeso;
    private double pesoActualCargado = 0.0;
    private boolean disponible;

    public VehiculoRepartidor(int idVehiculo, String nombreConductor, double capacidadMaximaPeso, boolean disponible) {
        this.idVehiculo = idVehiculo;
        this.nombreConductor = nombreConductor;
        this.capacidadMaximaPeso = capacidadMaximaPeso;
        this.disponible = disponible;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public double getCapacidadMaximaPeso() {
        return capacidadMaximaPeso;
    }

    public void setCapacidadMaximaPeso(double capacidadMaximaPeso) {
        this.capacidadMaximaPeso = capacidadMaximaPeso;
    }

    public double getPesoActualCargado() {
        return pesoActualCargado;
    }

    public void setPesoActualCargado(double pesoActualCargado) {
        this.pesoActualCargado = pesoActualCargado;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean puedeCargar(double pesoPaquete){
        return (pesoActualCargado + pesoPaquete) <= capacidadMaximaPeso;
    }
        
}
