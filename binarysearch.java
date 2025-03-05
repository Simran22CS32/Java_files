package assignment;

public class binarysearch {

	public static void main(String[] args) {
		int [] a= {6,10,12,14,16,17,19,20,24,26};
		int srch = 16;
		int lo = 0;
		int hi = a.length - 1;
		int mi = (lo+hi/2);
		
		while (lo<=hi) {
		if (a[mi]==srch )
		{
			System.out.println("Element is at " +mi+ " index postion");
			break;
		}
		else if(a[mi]<srch) {
			lo=mi+1;
		}
		else {
			hi=mi-1;
		}
		mi=(lo+hi)/2;
	}
if(lo>hi) {
	System.out.println("element not found");
}
	}
}