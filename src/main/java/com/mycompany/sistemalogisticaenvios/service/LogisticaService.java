package com.mycompany.sistemalogisticaenvios.service;

import com.mycompany.sistemalogisticaenvios.exception.CapacidadExcedidaException;
import com.mycompany.sistemalogisticaenvios.exception.VehiculoNoDisponibleException;
import com.mycompany.sistemalogisticaenvios.model.Cliente;
import com.mycompany.sistemalogisticaenvios.model.Envio;
import com.mycompany.sistemalogisticaenvios.model.Paquete;
import java.util.List;
import com.mycompany.sistemalogisticaenvios.model.VehiculoRepartidor;
import java.util.ArrayList;

public class LogisticaService {

    private List<VehiculoRepartidor> listaVehiculos;
    private List<Envio> listaEnvios;

    public LogisticaService() {
        this.listaVehiculos = new ArrayList<>();
        this.listaEnvios = new ArrayList<>();
    }

    public void registrarVehiculo(VehiculoRepartidor vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public Envio crearEnvio(int idEnvio, Cliente cliente, Paquete paquete, VehiculoRepartidor vehiculo)
            throws VehiculoNoDisponibleException, CapacidadExcedidaException {
        if (!vehiculo.isDisponible()) {
            throw new VehiculoNoDisponibleException("El vehiculo " + vehiculo.getIdVehiculo() + " no esta disponible!");
        }
        if (!vehiculo.puedeCargar(paquete.getPeso())) {
            throw new CapacidadExcedidaException("El paquete " + paquete.getIdPaquete() + " excede la capacidad del vehiculo");
        }

        Envio envioCreado = new Envio(idEnvio, cliente, paquete, vehiculo);
        listaEnvios.add(envioCreado);
        vehiculo.setDisponible(false);
        return envioCreado;
    }

}
