package ejercicioSupermercado_pnt;

public class Verduleria extends Producto {

	public Verduleria(String nombre, double precio, double cantidad) {

		super(nombre, precio, cantidad);


	}

	@Override
	public String toString() {

		String contenido;
		
		String precio;
		
		if (getPrecio() %1 == 0) {
			
			precio =  String.valueOf(Math.round(getPrecio()));
				}
		else {
			
			precio = String.valueOf(getPrecio());
		}
		

		if (getCantidad() > 0 && getCantidad() < 1) {

			contenido = String.valueOf(Math.round(getCantidad() * 1000)) + "g";

		}
		
		else if (getCantidad() == 1) {
			
			contenido = "Kilo";
			
		}

		else {
			contenido = String.valueOf(getCantidad()) + " Kg";
		}

		
		return "Nombre: " + getNombre() + " /// " + "precio: $" + precio + " /// " + "Unidad de venta: "
				+ contenido;
	}

}
