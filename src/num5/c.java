package num5;

public class c {

	public static void insercao(int array[]) {
		for (int cont = 1; cont < array.length; cont++) {
			int tmp = array[cont];
			int var = cont - 1;
			while ((var >= 0) && (array[var] > tmp)) {
				array[var + 1] = array[var];
				var--;
			}
			array[var + 1] = tmp;
			for (int cont3 = 0; cont3 < array.length; cont3++) {
				System.out.print(array[cont3] + ",");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] array;

		array = new int[] { 3, 20, 5, 0, 1, -3, 9, 2, 2, 7, 3, 4 };

		insercao(array);

	}

}
