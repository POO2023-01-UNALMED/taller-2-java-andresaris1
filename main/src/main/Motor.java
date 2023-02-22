package main;

public class Motor {
	double numerocilindros;
	String tipo;
	int registro3;
	
	public Motor(double numerocilindros, int registro3) {
		this.tipo ="";
		this.numerocilindros = numerocilindros;
		this.registro3 = registro3;
	}
	
	public void cambioregistro(int cambioregistro) {
		this.registro3 = cambioregistro;
	}
	
	public void asignartipo(String asignartipo) {
		if(asignartipo.equals("electrico") || asignartipo.equals("gasolina")) {
			this.tipo = asignartipo;
		}
		
	}


}
