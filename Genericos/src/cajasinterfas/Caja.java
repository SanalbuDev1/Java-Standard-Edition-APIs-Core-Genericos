package cajasinterfas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja<Generic extends ProductoI> {

	private List<Generic> lista;
	private int tope;

	{
		lista = new ArrayList<Generic>();
	}

	public Caja(int tope) {
		this.tope = tope;
	}

	public void addGenerico(Generic elemento) {
		if (lista.size() < tope)
			lista.add(elemento);
	}

	public void borrarGenerico(Generic elemento) {
		lista.remove(elemento);
	}
	
	public void recorrerGalletas() {
		for (Generic generic : lista) {
			System.out.println(generic.toString());
		}
	}

	public List<Generic> getLista() {
		return lista;
	}
	
	public double precioTotal() {
		double total = 0;
		for(Generic miTipo : this.lista) {
			total += miTipo.getPrecio();
		}
		return total;
	}
	
	

}
