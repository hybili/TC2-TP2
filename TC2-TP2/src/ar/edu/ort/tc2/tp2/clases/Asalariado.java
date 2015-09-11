package ar.edu.ort.tc2.tp2.clases;

public class Asalariado extends Empleado {

	private int cantHoras;
	private double valorHora;

	public Asalariado() {
		// TODO Auto-generated constructor stub
		cantHoras = 0;
		valorHora = 0;
	}

	public Asalariado(int dni, String nombre, int cantHoras, double valorHora) {
		super(dni, nombre);
		this.cantHoras = cantHoras;
		this.valorHora = valorHora;
		// TODO Auto-generated constructor stub
	}

	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double calcularSueldo(){
		return cantHoras * valorHora;
	}

	@Override
	public String toString() {
		return super.toString() + ", cantHoras=" + cantHoras + ", valorHora=" + valorHora;
	}


}
