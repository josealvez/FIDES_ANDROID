package com.proyectofinal.fides_rca.interfaces;

import com.proyectofinal.fides_rca.persistence.Observacion;
import com.proyectofinal.fides_rca.persistence.Registro;

import java.util.ArrayList;

public class RegistroR {

    ArrayList<Registro> registros;

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }
}
