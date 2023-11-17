package java_array_programs;

//java program to find largest element in an array
public class Largest_Element_In_An_Array {

	static int largest() {

		int[] arr = { 10, 20, 45, 90, 80 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest in given array is " + largest());
	}
}