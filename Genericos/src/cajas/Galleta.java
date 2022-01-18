package cajas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Galleta {

	private String sabor;

	public Galleta(String sabor) {
		super();
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Galleta [sabor=" + sabor + "]";
	}
		
}
