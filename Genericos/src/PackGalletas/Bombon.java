package PackGalletas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bombon {

	private String tipo;

	public Bombon(String tipo) {
		super();
		this.tipo = tipo;
	}
	
}
