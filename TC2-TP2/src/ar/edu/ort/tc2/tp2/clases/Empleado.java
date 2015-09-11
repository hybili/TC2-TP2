package ar.edu.ort.tc2.tp2.clases;

public class Empleado {
	private int dni;
	private String nombre;

	public Empleado(){
		dni = 0;
		nombre = "sin nombre";			
	}

	public Empleado(int dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;

	}

	public String toString(){
		return "dni=" + dni + ", nombre=" + nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
