package num2;

import java.util.Scanner;

public class teste {

	public static void bolha(int array[], int tamanho) {
		int bolha;
		for (int cont = 0; cont < tamanho - 1; cont++) {
			for (int cont2 = tamanho - 1; cont2 > cont; cont2--) {
				if (array[cont2] < array[cont2 - 1]) {
					bolha = array[cont2];
					array[cont2] = array[cont2 - 1];
					array[cont2 - 1] = bolha;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] array = new int[10];
		int tam = 0;
		do {
			System.out.println("Digite um numero");
			array[tam] = teclado.nextInt();
			tam++;
			
		}while(tam != 10);
		
		bolha(array,tam);
		
		for(int cont = 0; cont < tam;cont++) {
			System.out.print(array[cont]+",");
		}
		teclado.close();

	}

}