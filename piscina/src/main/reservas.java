package main;

import java.util.Scanner;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/*
 * 
 * @author juancaaa11
 * @version 1.0
 * 
 */

public class reservas extends usuarios {

	protected int numreserva;
	protected LocalDate horareserva;
	
	
	public reservas(String nif, String nombre, String numTlfn, int numreserva, LocalDate horareserva) {
		super(nif, nombre, numTlfn);
		this.numreserva = numreserva;
		this.horareserva = horareserva;
	}


	public reservas() {
		
	}


	public float getNumreserva() {
		return numreserva;
	}


	public void setNumreserva(int numreserva) {
		this.numreserva = numreserva;
	}


	public LocalDate getHorareserva() {
		return horareserva;
	}


	public void setHorareserva(LocalDate horareserva) {
		this.horareserva = horareserva;
	}


	@Override
    public void MostrarInfo() {
        super.MostrarInfo();
        JOptionPane.showMessageDialog(null, "Datos de reserva:\nN�mero de reserva: " + this.numreserva + "\nHora de reserva: " + this.horareserva);
    }

    public void A�adirReserva() {
        String nombre = JOptionPane.showInputDialog("Nombre:");
        this.setNombre(nombre);

        String nif = JOptionPane.showInputDialog("DNI:");
        this.setNif(nif);

        String numTlfn = JOptionPane.showInputDialog("N�mero de tel�fono:");
        this.setNumTlfn(numTlfn);

        int opcion = JOptionPane.showConfirmDialog(null, "�Desea realizar una reserva?", "Confirmaci�n", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            LocalDate fecha = LocalDate.now();
            this.horareserva = fecha;

            String strNumReserva = JOptionPane.showInputDialog("N�mero de personas:");
            this.numreserva = Integer.parseInt(strNumReserva);

            JOptionPane.showMessageDialog(null, "Datos de reserva:\nN�mero de reserva: " + this.numreserva + "\nHora de reserva: " + this.horareserva);
        } else {
            JOptionPane.showMessageDialog(null, "Gracias!");
        }
			
			
		
		
		
	}
	
	
}
