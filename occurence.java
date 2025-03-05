package assignment;
import java.util.ArrayList;
public class occurence {

	public static void main(String[] args) {
		        int[] arr = {1, 2, 1, 3, 5, 1};
		        int elementToRemove = 1;
		        ArrayList<Integer> resultList = new ArrayList<>();
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] != elementToRemove) {
		                resultList.add(arr[i]); 
		            }
		        }
		        int[] resultArray = new int[resultList.size()];
		        for (int i = 0; i < resultList.size(); i++) {
		            resultArray[i] = resultList.get(i);
		        }
		        System.out.print("Array after removal: ");
		        for (int i : resultArray) {
		            System.out.print(i + " ");
		        }
		    }
		}
