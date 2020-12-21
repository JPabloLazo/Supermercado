package ejercicioSupermercado_pnt;

import java.util.*;

public class Presentacion {

	public static void main(String[] args) {

		Supermercado supermercado = new Supermercado();

		supermercado.getMercaderia().forEach(mercaderia -> System.out.println(mercaderia));

		System.out.println("=============================");

		System.out.println("Producto m�s caro: " + Collections.max(supermercado.getMercaderia()).getNombre());

		System.out.println("Producto m�s barato: " + Collections.min(supermercado.getMercaderia()).getNombre());

	}

}