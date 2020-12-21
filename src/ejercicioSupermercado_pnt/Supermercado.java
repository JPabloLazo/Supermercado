package ejercicioSupermercado_pnt;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private List<Producto> mercaderia;

	public Supermercado() {

		this.mercaderia = new ArrayList<Producto>();

		mercaderia.add(new Bebidas("Coca-Cola Zero", 20, 1.5));

		mercaderia.add(new Bebidas("Coca-Cola", 18, 1.5));

		mercaderia.add(new Limpieza("Shampoo Sedal", 19, 0.5));

		mercaderia.add(new Verduleria("Frutillas", 64, 1));
		
	}

	public List<Producto> getMercaderia() {

		return mercaderia;
	}


}
