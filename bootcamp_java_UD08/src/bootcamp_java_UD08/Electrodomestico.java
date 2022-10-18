package bootcamp_java_UD08;

public class Electrodomestico {
	static final int PRECIO = 100;
	static final String COLOR = "Blanco";
	static final String CONSUMO = "F";
	static final int PESO = 5;
	public int precioBase;
	public String color;
	public String consumoEnergetico;
	public int peso;
	
	/**
	 * Constructor 1 por defecto
	 */
	public Electrodomestico() {
		
		this.precioBase = PRECIO;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
		
	}
	/**
	 * Constructor 2 con precio y peso
	 */
	public Electrodomestico(int precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = peso;
		
	}
	/**
	 * Constructor 3 con todos los atributos
	 */
	public Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
		
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}
}
