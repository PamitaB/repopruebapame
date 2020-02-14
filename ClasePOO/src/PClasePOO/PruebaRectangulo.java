package PClasePOO;

public class PruebaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo rect1 = new Rectangulo();
		rect1.altura = 4;
		rect1.base = 10;
		System.out.println("El area es 	: " + rect1.calcularArea());
		System.out.println("El perimetro es : " + rect1.calcularPerimetro());
		
		Rectangulo rect2 = new Rectangulo();
		rect2.setAltura(20);
		rect2.setBase(50);
		System.out.println("El area es 	: " + rect2.calcularArea());
		System.out.println("El perimetro es	: " + rect2.calcularPerimetro());

		Rectangulo rect3 = new Rectangulo(15,40);
		System.out.println("El area es 	: " + rect3.calcularArea());
		System.out.println("El perimetro es : " + rect3.calcularPerimetro());
		
	}

}
