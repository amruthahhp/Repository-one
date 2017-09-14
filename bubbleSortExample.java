import java.sql.Array;

public class bubbleSortExample {

	public static void bubbleSortTechnique(int[] arr) {
		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < (n - i); j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 45, 10, 25, 8, 20 };
		System.out.println("Elements before sorting");
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// calling bubble sort technique method here
		System.out.println();
		bubbleSortTechnique(arr);

		System.out.println("Elements after sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}
}
