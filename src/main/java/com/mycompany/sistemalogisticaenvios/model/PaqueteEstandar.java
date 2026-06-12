package com.mycompany.sistemalogisticaenvios.model;

public class PaqueteEstandar extends Paquete{
    
    public PaqueteEstandar(int idPaquete,double peso,String direccionDestino){
        super(idPaquete, peso, direccionDestino);
    }
    
    @Override
    public double calcularCostoTotal(){
        return getCostoBase();
    }
}
