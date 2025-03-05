package assignment;
import java.util.Scanner ;
public class simpleinterest {

	public static void main(String[] args) {
		int p,r,t,si;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the principal :");
		p=in.nextInt();
		System.out.println("Enter the rate : ");
		r=in.nextInt();
		System.out.println("Enter thet time :");
		t= in.nextInt();
		si= p*r*t/100;
		System.out.println("Simple Interest = " +si);
	}

}

