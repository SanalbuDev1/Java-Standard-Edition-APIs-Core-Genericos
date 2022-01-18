package PackGalletas;

import java.util.Objects;

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

	@Override
	public int hashCode() {		
		return Objects.hash(sabor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galleta other = (Galleta) obj;
		return Objects.equals(sabor, other.sabor);
	}
	
	
		
}
