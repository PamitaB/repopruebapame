package PClasePOO;

public class pruebaTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiempo tempHms = new Tiempo(10,65,30);
		System.out.println("Es valida?: " + tempHms.validarHora());
		
		tempHms.modificarHora(12, 30, 45);
		System.out.println("Es valida?: " + tempHms.validarHora());
	
	}
}
