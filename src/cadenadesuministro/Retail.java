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

class Retail extends Eslabon{
    private ArrayList<DistributionCenter> distribuidorCompra;
    private ArrayList<ProductoVenta> productos;

    public Retail(ArrayList<DistributionCenter> distribuidorCompra, ArrayList<ProductoVenta> productos, String nombre, String descripcion, ArrayList<Integer> direccion, Fecha fechaEnt, Fecha fechaSal) {
        super(nombre, descripcion, direccion, fechaEnt, fechaSal);
        this.distribuidorCompra = distribuidorCompra;
        this.productos = productos;
    }

    public ArrayList<DistributionCenter> getDistribuidorCompra() {
        return distribuidorCompra;
    }

    public void setDistribuidorCompra(ArrayList<DistributionCenter> distribuidorCompra) {
        this.distribuidorCompra = distribuidorCompra;
    }

    public ArrayList<ProductoVenta> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoVenta> productos) {
        this.productos = productos;
    }
    
    public void generarFactura (){
        
    }
}
