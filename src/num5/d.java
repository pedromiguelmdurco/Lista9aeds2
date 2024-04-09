package num5;

public class d {

	public static void shellsort(int[] array) {
		int h = 1;
		do {
			h = (h * 3) + 1;
		} while (h < array.length);
		
		for (int cont3 = 0; cont3 < array.length; cont3++) {
			System.out.print(array[cont3] + ",");
		}
		System.out.println();
		
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
		for (int cont3 = 0; cont3 < array.length; cont3++) {
			System.out.print(array[cont3] + ",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] array;

		array = new int[] { 3, 20, 5, 0, 1, -3, 9, 2, 2, 7, 3, 4 };

		shellsort(array);

	}

}
