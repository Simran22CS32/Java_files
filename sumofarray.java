package assignment;

public class sumofarray {

	public static void main(String[] args) {
		int [] array= {2,4,6,7,9};
		int length = array.length;
		int sum =0;
		for (int i =0;i<length ; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array is : " +sum);
	}

}
