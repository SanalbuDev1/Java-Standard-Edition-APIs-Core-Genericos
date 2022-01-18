package PackGalletas;

public class Principal {

	public static void main(String[] args) {
		
		Galleta g1 = new Galleta("chocolate");
		Galleta g2 = new Galleta("vainilla");
		Galleta g3 = new Galleta("fresa");
		Galleta g4 = new Galleta("chocolate");
		
		Pack<Galleta> miPack = new Pack<Galleta>(g1, g4);
		System.out.println(miPack.getElemento1().getSabor());
		System.out.println(miPack.getElemento2().getSabor());
		
		System.out.println(g1.equals(g4));
		System.out.println(miPack.iguales());
		
		System.out.println("Galleta 1 " + g1.hashCode());
		System.out.println("Galleta 2 " +g2.hashCode());
		System.out.println("Galleta 3 " +g3.hashCode());
		System.out.println("Galleta 4 " +g4.hashCode());
		
		System.out.println(g1 == g1);
		System.out.println(g1 == g2);
		System.out.println(g1 == g3);
		System.out.println(g1 == g4);
		
		System.out.println("g1 es igual a g1 " + g1.equals(g1));
		System.out.println("g1 es igual a g2 " +g1.equals(g2));
		System.out.println("g1 es igual a g3 " +g1.equals(g3));
		System.out.println("g1 es igual a g4 " +g1.equals(g4));
	}
	
}
