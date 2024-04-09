package num3;

import java.util.Scanner;

public class teste {

	public static void insercao(int array[]) {
		for (int cont = 1; cont< array.length; cont++) {
			int tmp = array[cont];
			int var = cont - 1;
			while ((var >= 0) && (array[var] > tmp)) {
				array[var + 1] = array[var];
				var--;
			}
			array[var + 1] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);


		int[] array = new int[10];
		
		for(int cont = 0; cont < array.length;cont++) {
			System.out.println("Digite um numero");
			array[cont] = teclado.nextInt();
			
		};
	
		insercao(array);
		
		for(int cont = 0; cont < array.length;cont++) {
			System.out.print(array[cont]+",");
		}
		
		teclado.close();

	}
}

