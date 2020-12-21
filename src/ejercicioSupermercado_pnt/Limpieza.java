package ejercicioSupermercado_pnt;

public class Limpieza extends Producto {

	public Limpieza(String nombre, double precio, double cantidad) {

		super(nombre, precio, cantidad);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		String contenido;
		
		String precio;
		
		if (getPrecio() %1 == 0) {
			
			precio =  String.valueOf(Math.round(getPrecio()));
				}
		else {
			
			precio = String.valueOf(getPrecio());
		}
		

		if (getCantidad() > 0 && getCantidad() < 1) {

			contenido = String.valueOf(Math.round(getCantidad() * 1000)) + "ml";

		}

		else {
			contenido = String.valueOf(getCantidad()) + "L";
		}

		return "Nombre: " + getNombre() + " /// " + "Contenido: " + contenido + " /// " + "Precio: $" + precio;
	}

}
