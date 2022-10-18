package bootcamp_java_UD08;

public class Persona {
	static final String SEXO = "H";
	private String nombre;
	private int edad;
	private String dni;
	private String sex;
	private double peso;
	private double altura;

	/**
	 * Constructor 1 atributos con dni
	 */
	public Persona(String dni) {
		
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sex = SEXO;
		this.peso = 0.0;
		this.altura = 0.0;
		
	}
	/**
	 * Constructor 2 atributos con nombre, edad, dni y sexo
	 */
	public Persona(String nombre, int edad, String dni, String sex) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sex = sex;
		this.peso = 0.0;
		this.altura = 0.0;
		
	}
	/**
	 * Constructor 2
	 * 
	 * @param nombre
	 * @param edad
	 * @param dni
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, String dni, String sex, double peso, double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sex = sex;
		this.peso = peso;
		this.altura = altura;
		
	}

}
