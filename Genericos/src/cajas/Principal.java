package cajas;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta("chocolate");
		Galleta g2 = new Galleta("vainilla");
		Galleta g3 = new Galleta("fresa");
		
		Caja<Galleta> cajaGalletas = new Caja<Galleta>(2);
		cajaGalletas.addGenerico(g1);
		cajaGalletas.addGenerico(g2);
		cajaGalletas.addGenerico(g3);
		
		cajaGalletas.recorrerGalletas();
		
		for(Galleta lista :cajaGalletas.getLista()) {
			System.out.println("Lista " + lista.getSabor());
		}
		
		//Bombones
		
		Caja<Bombon> cajaBombon = new Caja<Bombon>(2);
		cajaBombon.addGenerico(new Bombon("dulce"));
		cajaBombon.addGenerico(new Bombon("salado"));
		cajaBombon.addGenerico(new Bombon("vencido"));
		
	}
	
}
