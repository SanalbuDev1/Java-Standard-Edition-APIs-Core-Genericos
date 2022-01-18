package cajasinterfas;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta("chocolate",1000);
		Galleta g2 = new Galleta("vainilla",2000);
		Galleta g3 = new Galleta("fresa",3000);
		
		Caja<Galleta> cajaGalletas = new Caja<Galleta>(2);
		cajaGalletas.addGenerico(g1);
		cajaGalletas.addGenerico(g2);
		cajaGalletas.addGenerico(g3);
		
		cajaGalletas.recorrerGalletas();
		
		for(Galleta lista :cajaGalletas.getLista()) {
			System.out.println("Lista " + lista.getSabor());
		}
		
		//Bombones
		
		Caja<Bombon> cajaBombon = new Caja<Bombon>(3);
		cajaBombon.addGenerico(new Bombon("dulce",5));
		cajaBombon.addGenerico(new Bombon("salado",1));
		cajaBombon.addGenerico(new Bombon("vencido",3));
		
		System.out.println(cajaBombon.precioTotal());
		
	}
	
}
