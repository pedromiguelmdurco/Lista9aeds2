package num5;

public class b {

	public static void bolha(int array[], int tamanho) {
		int bolha;
		for (int cont = 0; cont < tamanho - 1; cont++) {
			for (int cont3 = 0; cont3 < array.length; cont3++) {
				System.out.print(array[cont3] + ",");
			}
			System.out.println();
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
		int[] array;

		array = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
				//{ 3, 20, 5, 0, 1, -3, 9, 2, 2, 7, 3, 4 };

		bolha(array, array.length);

	}

}
