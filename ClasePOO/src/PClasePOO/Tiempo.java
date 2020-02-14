package PClasePOO;

public class Tiempo {

	int hora;
	int minuto;
	int segundo;
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

		

	Tiempo(){
		
	}
	
	Tiempo(int _hora, int _minuto, int _segundo){
		this.hora = _hora;
		this.minuto = _minuto;
		this.segundo = _segundo;		
	}
	
	Tiempo(int _hora, int _minuto){
		this.hora = _hora;
		this.minuto = _minuto;
		this.segundo = 0;
	}
	
	Tiempo(int _hora){
		this.hora = _hora;
		this.minuto = 0;
		this.segundo = 0;
	}
	
	public boolean validarHora() {
		boolean resultado = false;
		
		if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
			resultado = true;
		}
		return resultado;
	}
	
	public void modificarHora(int _hora, int _minuto, int _segundo) {
		this.hora = _hora;
		this.minuto = _minuto;
		this.segundo = _segundo;
		System.out.println("Hora es valida?" + validarHora());
	}
		/*public void modificarHm(int _hora, int _minuto) {
		this.hora = _hora;
		this.minuto = _minuto;
		System.out.println("La hora es " + this.hora + this.minuto);
	}
		public void mostrarH(int _hora) {
		this.hora = _hora;
		System.out.println("La hora es " + this.hora);		
	}*/
}
	
	
