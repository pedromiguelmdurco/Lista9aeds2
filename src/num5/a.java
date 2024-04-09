package num5;

public class a {

	public static void selecao(int[] array) {

		for (int i = 0; i < (array.length - 1); i++) {
			int menor = i;
			for (int j = (i + 1); j < array.length; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}
			/*
			 * for (int cont = 0; cont < array.length; cont++) {
			 * System.out.print(array[cont] + ","); }
			 */
			System.out.println();
			int temp = array[menor];

			array[menor] = array[i];

			for (int cont = 0; cont < array.length; cont++) {
				System.out.print(array[cont] + ",");
			}
			System.out.printf("\n");
			array[i] = temp;

			for (int cont = 0; cont < array.length; cont++) {
				System.out.print(array[cont] + ",");
			}
			System.out.printf("\n----------------------\n");
		}

	}

	public static void main(String[] args) {
		int[] array;

		array = new int[] { 3, 20, 5, 0, 1, -3, 9, 2, 2, 7, 3, 4 };
		int var = 0;
		for (int cont = 18; cont > 0; cont--) {
			var += cont + 2;
		}

		System.out.println(var);
		selecao(array);

	}

}
