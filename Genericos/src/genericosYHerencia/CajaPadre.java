package genericosYHerencia;

import java.util.Iterator;
import java.util.List;

public class CajaPadre<Padre> implements Iterable<Padre>  {

	protected List<Padre> lista;
	protected int tope;

	public void addGenerico(Padre elemento) {
		if (lista.size() < tope)
			lista.add(elemento);
	}

	public void borrarGenerico(Padre elemento) {
		lista.remove(elemento);
	}		

	@Override
	public Iterator<Padre> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}

	
	
}
