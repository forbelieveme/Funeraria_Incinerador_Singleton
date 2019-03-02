package main;

import feretro.Feretro;
import singleton.Impresora;
import singleton.Incinerador;

public class Prueba_Incinerador_Singleton {

	public static void main(String[] args) {

		Feretro feretroUno = new Feretro("1");

		Impresora.getInstance().imprimir(Incinerador.getInstance().incinerar(feretroUno));

		Feretro feretroDos = new Feretro("2");

		Impresora.getInstance().imprimir(Incinerador.getInstance().incinerar(feretroDos));

	}
}
