package assignment;
import java.util.Scanner;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number ");
		int decimal =sc.nextInt();
		String binary ="";
		int num=decimal;
		if (decimal==0) {
			binary ="0";
			
		}
		else {
			while (decimal>0)
			{
				int remainder = decimal % 2;
				binary = remainder + binary ;
					decimal = decimal /2;
				
			}
		}
		System.out.println("binary representation of "+num +"is:" +binary);
		sc.close();
	}

}
