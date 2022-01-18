package genericosYHerencia;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bombon implements ProductoI {

	private String tipo;
	private double precio;

	public Bombon(String tipo, double precio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;

	}

	@Override
	public double getPrecio() {
		return precio;
	}

}
