package application;

import java.util.Locale;
import java.util.Scanner;

import utils.ConsultarSaldo;
import utils.Deposito;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ConsultarSaldo saldo = new ConsultarSaldo(500);
		//ConsultarChequeEspecial cheque = new ConsultarChequeEspecial(500);
		Deposito d = new Deposito(50);
		
		
		System.out.println(saldo);
		//System.out.println(cheque);
		System.out.println(d);
		
		
		sc.close();

	}

}