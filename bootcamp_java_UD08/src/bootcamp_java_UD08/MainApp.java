package bootcamp_java_UD08;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class MainApp {
	public static void iniciarPersona() {
	
	}
	public static void iniciarPassword() {
		
	}
	public static void iniciarElectrodomestico() {
		
	}
	public static void iniciarSerie() {
		
	}
	public static void main(String[] args) {
		String opcionMenu = "";
		while (!opcionMenu.equalsIgnoreCase("salir") && !opcionMenu.equals("4")) {
			opcionMenu = JOptionPane.showInputDialog(
					" Elige la aplicación:\n 1. Persona\n 2. Password\n 3. Electrodomestico\n 4. Serie\n 5. Salir");
			if (opcionMenu.equalsIgnoreCase("Persona") || opcionMenu.equals("1")) {
				iniciarPersona();
			} else if (opcionMenu.equalsIgnoreCase("Password") || opcionMenu.equals("2")) {
				iniciarPassword();
			} else if (opcionMenu.equalsIgnoreCase("Electrodomestico") || opcionMenu.equals("3")) {
				iniciarElectrodomestico();
			} else if (opcionMenu.equalsIgnoreCase("Serie") || opcionMenu.equals("4")) {
				iniciarSerie();
			} else if (opcionMenu.equalsIgnoreCase("salir") || opcionMenu.equals("5")) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("Debes elegir una de las opciones");
			}
			
		}
	}

}
