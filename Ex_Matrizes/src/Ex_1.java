import java.util.*;

public class Ex_1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		//inicio da logica para solicitar a matriz
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		//fim da logica de solicitacao
		
		//inicio da exibicao da matriz
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++) {
				
				System.out.print(" " + mat[i][j]);
				
			}
			System.out.println();
		}
		//fim da exibicao da matriz
		
		int t = 0;
		
		System.out.print("Números negativos: ");
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++) {
				
				if(mat[i][j] < 0) {
					t = t += 1;
					System.out.print(" " + mat[i][j]);
					
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("Diagonal principal: ");
		for(int i = 0; i < mat.length; i++){
			System.out.print(" " + mat[i][i]);
		}
		System.out.println();
		System.out.println("quantidade de negativos: " + t);
		sc.close();
	}

}
