package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 
 * @author juancaaa11
 * @version 1.0
 * 
 */

public class usuarios {

    protected String nif, nombre, numTlfn;

    public usuarios(String nif, String nombre, String numTlfn) {
        this.nif = nif;
        this.nombre = nombre;
        this.numTlfn = numTlfn;
    }

    public usuarios() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTlfn() {
        return numTlfn;
    }

    public void setNumTlfn(String numTlfn) {
        this.numTlfn = numTlfn;
    }

    public void MostrarInfo() {
        JOptionPane.showMessageDialog(null, "Su nombre es: " + this.nombre + "\ncon DNI: " + this.nif + "\ny número de teléfono: " + this.numTlfn);
    }
}

