package PackGalletas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pack<T> {

	private T elemento1;
	private T elemento2;

	public Pack(T elemento1, T elemento2) {
		super();
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}

	public boolean iguales() {
		return this.elemento1.equals(elemento2);
	}
}
