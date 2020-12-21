package ejercicioSupermercado_pnt;

public abstract class Producto implements Comparable<Producto> {

	private String nombre;

	private double precio;

	private double cantidad;

	public Producto(String nombre, double precio, double cantidad) {

		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int compareTo(Producto otroProducto) {

		if (this.precio < otroProducto.precio) {

			return -1;
		}
		if (this.precio > otroProducto.precio) {

			return 1;
		}
		return 0;
	}

}
