package singleton;

public  class Impresora {
	private static Impresora impresora = null;
 
	private Impresora() {
	}
 
	public static Impresora getInstance() {
		
		synchronized (Impresora.class) {
			if (impresora == null) {
				impresora = new Impresora();
			}
			return impresora;
		}
	}

	public void imprimir(String a) {
		System.out.println(a);
	}
 
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}