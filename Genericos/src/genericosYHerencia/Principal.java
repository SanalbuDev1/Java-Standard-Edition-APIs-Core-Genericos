package genericosYHerencia;

import cajasinterfas.Caja;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta("chocolate",1000);
		Galleta g2 = new Galleta("vainilla",2000);
		Galleta g3 = new Galleta("fresa",3000);
		
		CajaProducto<Galleta> cajaGalletas = new CajaProducto<Galleta>(2);
		cajaGalletas.addGenerico(g1);
		cajaGalletas.addGenerico(g2);
		cajaGalletas.addGenerico(g3);	
			
		for(Galleta lista :cajaGalletas) {
			System.out.println("Lista " + lista.getSabor());
		}
		
		//Bombones
		
		CajaProducto<Bombon> cajaBombon = new CajaProducto<Bombon>(3);
		cajaBombon.addGenerico(new Bombon("dulce",5));
		cajaBombon.addGenerico(new Bombon("salado",1));
		cajaBombon.addGenerico(new Bombon("vencido",3));
		
		System.out.println(cajaBombon.precioTotal());
		
		CajaPadre<Libro> cajaLibro = new CajaPadre<Libro>();
		
	}
	
}
