package personas;

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona> {

	private int comOrdenar1;

	public static final int ASCENDENTE_EDAD = 1;
	public static final int DESCENDENTE_EDAD = 2;
	public static final int ASCENDENTE_NOMBRE = 3;
	public static final int DESCENDENTE_NOMBRE = 4;
	public static final int ASCENDENTE_PESO = 5;
	public static final int DESCENDENTE_PESO = 6;
	public static final int ASCENDENTE_ALTURA = 7;
	public static final int DESCENDENTE_ALTURA = 8;

	public ComparadorPersonas() {

		comOrdenar1 = ASCENDENTE_EDAD;
	}

	public void setComOrdenar(int como) {

		switch (como) {

		case ASCENDENTE_EDAD:
			comOrdenar1 = ASCENDENTE_EDAD;
			break;

		case DESCENDENTE_EDAD:
			comOrdenar1 = DESCENDENTE_EDAD;
			break;

		case ASCENDENTE_NOMBRE:
			comOrdenar1 = ASCENDENTE_NOMBRE;
			break;

		case DESCENDENTE_NOMBRE:
			comOrdenar1 = DESCENDENTE_NOMBRE;
			break;
			
		case ASCENDENTE_PESO:
			comOrdenar1 = DESCENDENTE_NOMBRE;
			break;
			
		case DESCENDENTE_PESO:
			comOrdenar1 = DESCENDENTE_NOMBRE;
			break;
			
		case ASCENDENTE_ALTURA:
			comOrdenar1 = DESCENDENTE_NOMBRE;
			break;
			
		case DESCENDENTE_ALTURA:
			comOrdenar1 = DESCENDENTE_NOMBRE;
			break;
		}
	}

	@Override
	public int compare(Persona p1, Persona p2) {

		int devolver = 0;

		switch (comOrdenar1) {

		case ASCENDENTE_EDAD:
			devolver = p1.getEdad() - p2.getEdad();
			if (devolver == 0) devolver = p1.getNombre().charAt(0) - p2.getNombre().charAt(0);
			break;

		case DESCENDENTE_EDAD:
			devolver = p2.getEdad() - p1.getEdad();
			if (devolver == 0) devolver = p2.getNombre().charAt(0) - p1.getNombre().charAt(0);
			break;

		case ASCENDENTE_NOMBRE:
			devolver = p1.getNombre().charAt(0) - p2.getNombre().charAt(0);
			if (devolver == 0) devolver = p1.getEdad() - p2.getEdad();
			break;

		case DESCENDENTE_NOMBRE:
			devolver = p2.getNombre().charAt(0) - p1.getNombre().charAt(0);
			if (devolver == 0) devolver = p2.getEdad() - p1.getEdad();
			break;

		}

		return devolver;
	}
}
