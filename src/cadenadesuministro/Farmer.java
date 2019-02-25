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

public class Farmer extends Eslabon{
    private ArrayList<String> nomProd;
    private ArrayList<Manufacturer> industriaVende;

    public Farmer(ArrayList<String> nomProd, ArrayList<Manufacturer> industriaVende, String nombre, String descripcion, ArrayList<Integer> direccion, Fecha fechaEnt, Fecha fechaSal) {
        super(nombre, descripcion, direccion, fechaEnt, fechaSal);
        this.nomProd = nomProd;
        this.industriaVende = industriaVende;
    }

    public ArrayList<String> getNomProd() {
        return nomProd;
    }

    public void setNomProd(ArrayList<String> nomProd) {
        this.nomProd = nomProd;
    }

    public ArrayList<Manufacturer> getIndustriaVende() {
        return industriaVende;
    }

    public void setIndustriaVende(ArrayList<Manufacturer> industriaVende) {
        this.industriaVende = industriaVende;
    }
    
    
}
