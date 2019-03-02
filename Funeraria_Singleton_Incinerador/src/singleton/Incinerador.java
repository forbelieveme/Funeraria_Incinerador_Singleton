package singleton;

import feretro.Feretro;

public class Incinerador {
	private static Incinerador incinerador = null;

	private Incinerador() {
	}

	public static Incinerador getInstance() {

		synchronized (Incinerador.class) {
			if (incinerador == null) {
				incinerador = new Incinerador();
			}
			return incinerador;
		}
	}

	public String incinerar(Feretro feretro) {
		return "Se ha incinerado el feretro con numero serial: " + feretro.getSerial();
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}