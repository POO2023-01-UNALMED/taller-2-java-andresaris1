package main;

public class Asientos {
	String color;
	double precio;
	int registro2;
	
	public Asientos(double precio, int registro2) {
		this.color = "";
		this.precio = precio;
		this.registro2 = registro2;
	}
	
	public void cambiarColor(String cambiarColor) {
		if(cambiarColor.equals("rojo") || cambiarColor.equals("verde") || cambiarColor.equals("amarillo") || cambiarColor.equals("negro") || cambiarColor.equals("blanco")) {
			this.color = cambiarColor;
		}
	}

}
