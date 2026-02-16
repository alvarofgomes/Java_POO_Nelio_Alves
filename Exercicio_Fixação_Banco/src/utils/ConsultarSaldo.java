package utils;

public class ConsultarSaldo {

	private double saldo;

	public ConsultarSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		
		return "Saldo Atual = " + String.format("%.2f", getSaldo());
		
	}
	
}