package bootcamp_java_UD08;

import java.util.Random;

public class Password {
	static final String caracters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	public int longitud;
	public String contraseña;
	/**
	 * Constructor 1 atributos con dni
	 */
	public Password(String contraseña) {
		this.longitud = 8;
		this.contraseña = contraseña;
		
	}
	public Password(int longitud) {
		this.longitud = longitud;
		StringBuilder contra = new StringBuilder();
		Random rand = new Random();
	    for (int i = 0; i < longitud; i++) {
	        int randomIndex = rand.nextInt(caracters.length());
	        contra.append(caracters.charAt(randomIndex));
	    }
		this.contraseña = contra.toString();
	}
	

}
