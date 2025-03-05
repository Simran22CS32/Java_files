package assignment;
public class removeleadingzeros {

	public static void main(String[] args) {
		        String input = "00000123569";
		        String output = input.replaceFirst("^0+", "");
		        System.out.println("Original input: " + input);
		        System.out.println("After removing leading zeros: " + output);
		    }
		}