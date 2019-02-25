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

public class Manufacturer extends Eslabon {

    private String lote;
    private ArrayList<Farmer> materiaPrima;
    private ArrayList<DistributionCenter> distribuidorVenta;

    public Manufacturer(String lote, ArrayList<Farmer> materiaPrima, ArrayList<DistributionCenter> distribuidorVenta, String nombre, String descripcion, ArrayList<Integer> direccion, Fecha fechaEnt, Fecha fechaSal) {
        super(nombre, descripcion, direccion, fechaEnt, fechaSal);
        this.lote = lote;
        this.materiaPrima = materiaPrima;
        this.distribuidorVenta = distribuidorVenta;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public ArrayList<Farmer> getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(ArrayList<Farmer> materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public ArrayList<DistributionCenter> getDistribuidorVenta() {
        return distribuidorVenta;
    }

    public void setDistribuidorVenta(ArrayList<DistributionCenter> distribuidorVenta) {
        this.distribuidorVenta = distribuidorVenta;
    }
    
    
    
}
