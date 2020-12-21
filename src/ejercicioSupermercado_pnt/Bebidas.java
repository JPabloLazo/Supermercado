package ejercicioSupermercado_pnt;

public class Bebidas extends Producto {

	public Bebidas(String nombre, double precio, double cantidad) {

		super(nombre, precio, cantidad);
	}

	@Override
	public String toString() {

		String contenido;

		String precio;

		if (getPrecio() % 1 == 0) {

			precio = String.valueOf(Math.round(getPrecio()));
		} else {

			precio = String.valueOf(getPrecio());
		}

		if (getCantidad() > 0 && getCantidad() < 1) {

			contenido = String.valueOf(Math.round(getCantidad() * 1000)) + "ml";

		}

		else {
			contenido = String.valueOf(getCantidad());
		}

		return "Nombre: " + getNombre() + " /// " + "Litros: " + contenido + " /// " + "Precio: $" + precio;
	}

}
