import java.util.*;

public class Ex_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		//inicio da logica para solicitar a matriz
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			System.out.println();
		}
		//fim da logica de solicitacao
		
		//inicio da exibicao da matriz
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				
				System.out.print(" " + mat[i][j]);
				
			}
			System.out.println();
		}
		//fim da exibicao da matriz
		
		int t = 0;
		
		System.out.println("Números negativos: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				
				if(mat[i][j] < 0) {
					t = t += 1;
					System.out.print(" " + mat[i][j]);
					
				}
				
			}
			System.out.print(" ");
		}
		System.out.print("Diagonal principal: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++) {
				
			}
			System.out.print(" " + mat[i][i]);
		}
		System.out.println();
		System.out.println("quantidade de negativos: " + t);
		sc.close();
	}

}
