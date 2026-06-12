package com.mycompany.sistemalogisticaenvios;

import com.mycompany.sistemalogisticaenvios.exception.CapacidadExcedidaException;
import com.mycompany.sistemalogisticaenvios.exception.VehiculoNoDisponibleException;
import com.mycompany.sistemalogisticaenvios.model.Cliente;
import com.mycompany.sistemalogisticaenvios.model.Envio;
import com.mycompany.sistemalogisticaenvios.model.PaqueteFragil;
import com.mycompany.sistemalogisticaenvios.model.EstadosEnvio;
import com.mycompany.sistemalogisticaenvios.model.PaqueteEstandar;
import com.mycompany.sistemalogisticaenvios.model.PaquetePerecedero;
import com.mycompany.sistemalogisticaenvios.model.VehiculoRepartidor;
import com.mycompany.sistemalogisticaenvios.service.LogisticaService;

public class SistemaLogisticaEnvios {

    public static void main(String[] args) {

        LogisticaService servicio = new LogisticaService();

        Cliente cliente1 = new Cliente(1, "Hilario", "Benito Juarez.Col.Santa Catalina", "2382525578");
        VehiculoRepartidor auto1 = new VehiculoRepartidor(1, "Carlos Manzo", 500, true);
        VehiculoRepartidor auto2 = new VehiculoRepartidor(1, "Martin Carrera", 20, true);

        servicio.registrarVehiculo(auto1);
        servicio.registrarVehiculo(auto2);

        PaqueteEstandar paqueteNormal = new PaqueteEstandar(1, 100, "Calle Las margaritas #413");
        PaqueteFragil paqueteFragil = new PaqueteFragil(2, 15, "Col. las margaritas", 80);
        PaquetePerecedero paquetePerecedero = new PaquetePerecedero(3, 35, "Camino a rancho San Marcos", 2);
        
        try {
            Envio envio1 = servicio.crearEnvio(1, cliente1, paqueteNormal, auto1);
            System.out.println("El envio es: " + envio1.obtenerCostoEnvioFinal() + " del paquete: "+ paqueteNormal.getIdPaquete());
            Envio envio2 = servicio.crearEnvio(1, cliente1, paquetePerecedero, auto2);
            System.out.println("El envio es: " + envio2.obtenerCostoEnvioFinal() + " del paquete: "+ paqueteNormal.getIdPaquete());
            
        } catch (CapacidadExcedidaException | VehiculoNoDisponibleException e) {
            System.out.println("Error Logistica: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Error de sistema: " + e.getMessage());
        }
    }
}
