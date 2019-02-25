/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenadesuministro;

/**
 *
 * @author daaariaspa
 */
import java.util.*;

public class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected ArrayList<Integer> direccion;
    protected Fecha fechaEnt;
    protected Fecha fechaSal;

    public Eslabon(String nombre, String descripcion, ArrayList<Integer> direccion, Fecha fechaEnt, Fecha fechaSal) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fechaEnt = fechaEnt;
        this.fechaSal = fechaSal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Integer> getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList<Integer> direccion) {
        this.direccion = direccion;
    }

    public Fecha getFechaEnt() {
        return fechaEnt;
    }

    public void setFechaEnt(Fecha fechaEnt) {
        this.fechaEnt = fechaEnt;
    }

    public Fecha getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(Fecha fechaSal) {
        this.fechaSal = fechaSal;
    }
    
    
}
