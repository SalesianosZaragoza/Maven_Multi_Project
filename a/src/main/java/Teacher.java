

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Teacher {

	private static final Teacher INSTANCE = new Teacher();

	// El constructor privado no permite que se genere un constructor por defecto.
	// (con mismo modificador de acceso que la definición de la clase)
	private Teacher() {
	}

	public static Teacher getInstance() {
		return INSTANCE;
	}

	public int sumar(Integer n1, Integer n2) {
		// progrmacion defensiva
		// no deberia existir
		if (null == n1 || null == n2) {
			throw new IllegalArgumentException("argumentos invalidos");
		}

		return n1 + n2;

	}

	public List<String> baseDatos(boolean correcto) {
		List<String> personas = new ArrayList();
		if(correcto) {
			personas.add("pepe");
			personas.add("juan");
		}
		return personas;
	}

	private void testOptional() {
		Optional<String> dameNombre = dameNombre(false);
		dameNombre.orElse("alumno");
	}

	public Optional<String> dameNombre(boolean correcto) {
		String name = null;
		if (correcto) {
			name = "gorka";
		}
		return Optional.of(name);

	}


}