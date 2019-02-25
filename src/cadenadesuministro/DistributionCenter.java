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

public class DistributionCenter extends Eslabon{
    private ArrayList<Manufacturer> productorCompra;
    private ArrayList<Retail> tiendaVenta;

    public DistributionCenter(ArrayList<Manufacturer> productorCompra, ArrayList<Retail> tiendaVenta, String nombre, String descripcion, ArrayList<Integer> direccion, Fecha fechaEnt, Fecha fechaSal) {
        super(nombre, descripcion, direccion, fechaEnt, fechaSal);
        this.productorCompra = productorCompra;
        this.tiendaVenta = tiendaVenta;
    }

    public ArrayList<Manufacturer> getProductorCompra() {
        return productorCompra;
    }

    public void setProductorCompra(ArrayList<Manufacturer> productorCompra) {
        this.productorCompra = productorCompra;
    }

    public ArrayList<Retail> getTiendaVenta() {
        return tiendaVenta;
    }

    public void setTiendaVenta(ArrayList<Retail> tiendaVenta) {
        this.tiendaVenta = tiendaVenta;
    }
    
    
}
