package num4;

import java.util.Scanner;

public class teste {


	public static void shellsort(int[] array) {
		int h = 1;
		do {
			h = (h * 3) + 1;
		} while (h < array.length);
		do {
			h /= 3;
			for (int cor = 0; cor < h; cor++) {
				insercaoCor(array, array.length, cor, h);
			}
		} while (h != 1);
	}

	public static void insercaoCor(int[] array, int n, int cor, int h) {
		for (int i = (h + cor); i < n; i += h) {
			int tmp = array[i];
			int j = i - h;
			while ((j >= 0) && (array[j] > tmp)) {
				array[j + h] = array[j];
				j -= h;
			}
			array[j + h] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] array = new int[3];

		for (int cont = 0; cont < array.length; cont++) {
			System.out.println("Digite um numero");
			array[cont] = teclado.nextInt();

		}
		;

		shellsort(array);

		for (int cont = 0; cont < array.length; cont++) {
			System.out.print(array[cont] + ",");
		}

		teclado.close();

	}
}
