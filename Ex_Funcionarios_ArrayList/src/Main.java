import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.println("Quantos funcionários serão registrados?");
		int qtd = sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			
			Funcionario f = new Funcionario();
			
			System.out.println("Funcionário #" + (i + 1));
			System.out.println("Id: ");
			f.setId(sc.nextInt());
			System.out.println("Nome: ");
			sc.nextLine();
			f.setNome(sc.nextLine());
			System.out.println("Salario: ");
			f.setSalario(sc.nextDouble());
			
			funcionarios.add(f);
			
		}
		
		System.out.println("Insira o ID do funcionário que receberá o aumento salarial: ");
		int id = sc.nextInt();
		for(Funcionario f1 : funcionarios) {
			if(id == f1.getId()) {
				System.out.println("Digite a porcentagem do aumento: ");
				int p = sc.nextInt();
				
				f1.aumentoDeSalario(p);
			}
		}
		
		System.out.println("Lista de Funcionários");
		for(Funcionario f1 : funcionarios) {
			
			System.out.println(f1.getId() + ", " + f1.getNome() + ", " + f1.getSalario());
			
		}

	}

}
