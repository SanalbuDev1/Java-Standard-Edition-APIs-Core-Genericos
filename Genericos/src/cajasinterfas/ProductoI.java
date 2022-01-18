package cajasinterfas;

public interface ProductoI {

	// Permita una clase concretar su precio
	public abstract void setPrecio(double precio);
	public abstract double getPrecio();
	
}
