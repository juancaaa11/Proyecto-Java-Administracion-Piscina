package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 * 
 * @author juancaaa11
 * @version 1.0
 * 
 */


public class main {

    public static void despedida() {
        JOptionPane.showMessageDialog(null, "Hasta luego, gracias por utilizar!");
    }

    public static void main(String[] args) {
        
    	int opcion;
        ArrayList<reservas> listaUsuario = new ArrayList<>();
        

        do {
            String input = JOptionPane.showInputDialog(
                "BIENVENIDOS A LA PISCINA MUNICIPAL\n"
                + "----------------------------------\n"
                + "¿Qué desea hacer?\n"
                + "1. Hacer Reserva\n"
                + "2. Ver Datos Reserva\n"
                + "3. Salir"
            );

            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                	reservas nuevaReserva = new reservas();
                    JOptionPane.showMessageDialog(null, "Registrando nueva reserva:");
                    nuevaReserva.AñadirReserva();

                    if (nuevaReserva.getNif() != null && !nuevaReserva.getNif().isEmpty()
                            && nuevaReserva.getNombre() != null && !nuevaReserva.getNombre().isEmpty()
                            && nuevaReserva.getNumTlfn() != null && !nuevaReserva.getNumTlfn().isEmpty()
                            && nuevaReserva.getNumreserva() != 0 && nuevaReserva.getHorareserva() != null) {
                        listaUsuario.add(nuevaReserva);
                        JOptionPane.showMessageDialog(null, "Reserva registrada con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Los datos de la reserva están incompletos. La reserva no se ha registrado.");
                    }
                    break;

                case 2:
                	
             
                	    for (reservas reserva : listaUsuario) {
                	        reserva.MostrarInfo();
                	       
                	    }
                	   
                	    JOptionPane.showMessageDialog(null, "No tenemos mas reservas!");
                	    break;

                case 3:
                	
                    despedida();
                    break;
            }

        } while (opcion != 3);
    }
}
