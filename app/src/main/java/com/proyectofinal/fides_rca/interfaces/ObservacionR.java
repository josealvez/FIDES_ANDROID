package com.proyectofinal.fides_rca.interfaces;


import com.proyectofinal.fides_rca.persistence.Observacion;

import java.util.ArrayList;

public class ObservacionR {
    ArrayList<Observacion> observaciones;

    public ArrayList<Observacion> getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(ArrayList<Observacion> observaciones) {
        this.observaciones = observaciones;
    }
}
