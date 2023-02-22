package personas;

public class Persona {

	private String nombre;
	private int edad;
	private int peso;
	private int altura;

	public Persona(String nombre, int edad, int peso, int altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public String toString() {

		return "[" + nombre + " (" + edad + ") " + peso + "kg " + altura + "cm ]";
	}
}
