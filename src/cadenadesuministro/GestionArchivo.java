/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenadesuministro;

import java.util.*;
import java.io.*;

/**
 *
 * @author daaariaspa
 */
public class GestionArchivo {
    public Fecha RegistroFecha(){
        Scanner entrada =  new Scanner(System.in);
        int dia;
        int mes;
        int annio;
        Fecha fecha;
        System.out.println("Que dia: ");
        dia = entrada.nextInt();
        System.out.println("Que mes: ");
        mes = entrada.nextInt();
        System.out.println("Que annio: ");
        annio = entrada.nextInt();
        
        fecha = new Fecha(dia, mes, annio);
        return fecha;
    }
    
    public Farmer RegistrarFarmer(){
        Scanner entrada =  new Scanner(System.in);
        
        
        String nombre;
        String descripcion;
        String nombreProd;
        ArrayList<Integer> direccion = new ArrayList();
        ArrayList<String> nomProd = new ArrayList();
        int numProd;
        int longitud;
        int latitud;
        Fecha fechaEnt;
        Fecha fechaSal;
        ArrayList<Manufacturer> industriaVende = new ArrayList();
        
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Descripcion: ");
        descripcion = entrada.nextLine();
        System.out.println("Longitud ");
        longitud = entrada.nextInt();
        System.out.println("Longitud ");
        latitud = entrada.nextInt();
        direccion.add(longitud);
        direccion.add(latitud);
        
        fechaEnt = RegistroFecha();
        fechaSal = RegistroFecha();
        
        System.out.println("Cuantos productos produce la granja: ");
        numProd= entrada.nextInt();
        
        for (int i = 0; i < numProd; i++) {
            System.out.println("Nombre del producto: ");
            nombreProd = entrada.nextLine();
            nomProd.add(nombreProd);
        }
        
        
        return null;
    }
    
    public void RegistrarManufacturer(){
        Scanner entrada =  new Scanner(System.in);
        
        String nombre;
        String descripcion;
        String nombreProd;
        ArrayList<Integer> direccion = new ArrayList();
        ArrayList<String> nomProd = new ArrayList();
        int numProd;
        int longitud;
        int latitud;
        Fecha fechaEnt;
        Fecha fechaSal;
        
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Descripcion: ");
        descripcion = entrada.nextLine();
        System.out.println("Longitud ");
        longitud = entrada.nextInt();
        System.out.println("Longitud ");
        latitud = entrada.nextInt();
        direccion.add(longitud);
        direccion.add(latitud);
        
        fechaEnt = RegistroFecha();
        fechaSal = RegistroFecha();
        
        System.out.println("Cuantos productos produce la granja: ");
        numProd= entrada.nextInt();
        
        for (int i = 0; i < numProd; i++) {
            System.out.println("Nombre del producto: ");
            nombreProd = entrada.nextLine();
            nomProd.add(nombreProd);
        }
    }
}
