package com.mycompany.sistemalogisticaenvios.model;

public class Envio {

    private int idEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private VehiculoRepartidor vehiculo;
    

    public Envio(int idEnvio, Cliente cliente, Paquete paquete, VehiculoRepartidor vehiculo) {
        this.idEnvio = idEnvio;
        this.cliente = cliente;
        this.paquete = paquete;
        this.vehiculo = vehiculo;
        
        paquete.setStatusEnvio(EstadosEnvio.REGISTRADO);
        vehiculo.setPesoActualCargado(vehiculo.getPesoActualCargado() + paquete.getPeso());
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public VehiculoRepartidor getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoRepartidor vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double obtenerCostoEnvioFinal(){
        return paquete.calcularCostoTotal();
    }
    
}
