package utils;

public class Deposito extends ConsultarSaldo{

	private double depositar;

	public Deposito(double saldo) {
		super(saldo);
	}

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	
	public double depositarSaldo(double valor) {
		
		this.depositar = valor;
		this.setSaldo(this.getSaldo() + valor);
		return this.getSaldo();
		
	}
	
	public String toString() {
		
		return "Valor Do Deposito Com Saldo = " + String.format("%.2f", this.getSaldo());
		
	}
	
}