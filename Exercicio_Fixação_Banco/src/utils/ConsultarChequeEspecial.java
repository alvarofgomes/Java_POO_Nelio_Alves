package utils;

public class ConsultarChequeEspecial extends ConsultarSaldo{

	public ConsultarChequeEspecial(double saldo) {
		super(saldo);
	}

	private double cheque;
	
	public double getCheque() {
		return cheque;
	}

	public void setCheque(double cheque) {
		this.cheque = cheque;
	}

	public double chequeQuientos(double cheque) {
		
		cheque = 0.0;
		
		if (getSaldo() <= 500) {
			
			this.cheque = cheque += 50;
			
		}else {
			
			
			
		}
		
		return cheque;
		
	}
	
	public String toString() {
		
		return "Valor Do Cheque Especial = " + String.format("%.2f", chequeQuientos(this.cheque));
		
	}
	
}