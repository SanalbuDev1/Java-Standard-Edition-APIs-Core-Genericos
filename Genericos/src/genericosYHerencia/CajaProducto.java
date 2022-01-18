package genericosYHerencia;

import java.util.ArrayList;
import java.util.Iterator;

public class CajaProducto<Generic extends ProductoI> extends CajaPadre<Generic> {

	{
		lista = new ArrayList<Generic>();
	}

	public CajaProducto(int tope) {
		this.tope = tope;
	}

	public double precioTotal() {
		double total = 0;
		for(Generic miTipo : this.lista) {
			total += miTipo.getPrecio();
		}
		return total;
	}
	
	

}
