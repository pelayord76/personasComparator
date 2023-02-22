package personas;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {

		// int[] numeros = { 15, 19, 21, 22, 18, 16, 17, 23, 20 };

		Persona personas[] = new Persona[5];
		personas[0] = new Persona("Pablo", 16, 40, 150);
		personas[1] = new Persona("Diego", 17, 50, 165);
		personas[2] = new Persona("Pedro", 17, 150, 170);
		personas[3] = new Persona("Ordoño", 20, 400, 120);
		personas[4] = new Persona("Lucia", 20, 70, 185);

		// System.out.println(Arrays.toString(numeros));
		// Arrays.sort(numeros);
		// System.out.println(Arrays.toString(numeros));

		System.out.println(Arrays.toString(personas));
		ComparadorPersonas cp = new ComparadorPersonas();
		Arrays.sort(personas, cp);
		System.out.println(Arrays.toString(personas));

		cp.setComOrdenar(ComparadorPersonas.ASCENDENTE_EDAD);
		Arrays.sort(personas, cp);
		System.out.println(Arrays.toString(personas));

		// for (Persona persona : personas) {
		// System.out.println(persona);
		// }
	}
}
