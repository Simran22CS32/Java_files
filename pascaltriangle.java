package assignment;
import java.util.Scanner;
public class pascaltriangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines :");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		int spaces = no;
		int number = 1;
		for (int i=0;i<=no;i++) {
			for (int s= 1; s <= spaces; s++)
			{
				System.out.println(" ");
			}
			number = 1;
			for(int j=0 ; j<= i; j++) 
			{
				System.out.println(number + " ");
				number = number * (i-j)/(j+1);
			}
			spaces--;
			System.out.println();
		}
	}
}
