package bootcamp_java_UD08;

public class Serie {
	public String titulo;
	public int numTemporadas;
	public boolean entregado;
	public String genero;
	public String creador;
	
	/**
	 * Constructor 1 por defecto
	 */
	public Serie() {
		
		this.titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
		
	}
	/**
	 * Constructor 2 con titulo y creador
	 */
	public Serie(String titulo, String creador) {
		
		this.titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
		
	}
	/**
	 * Constructor 3 todos los atributos menos entregado
	 */
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
		
	}
}
