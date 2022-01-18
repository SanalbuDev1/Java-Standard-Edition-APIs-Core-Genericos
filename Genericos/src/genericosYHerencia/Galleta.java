package genericosYHerencia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Galleta implements ProductoI {

	private String sabor;
	private double precio;

	public Galleta(String sabor, double precio) {
		super();
		this.sabor = sabor;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Galleta [sabor=" + sabor + "]";
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
		
	}

	@Override
	public double getPrecio() {
		return this.precio;
	}
		
}
