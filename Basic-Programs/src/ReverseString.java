import java.util.Scanner;

public class ReverseString {

	static void reverse() {
		String original, reverse = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		original = input.nextLine();
		
		int length = original.length();
		
		for (int i = length -1; i >= 0; i --) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse of the string is: " + reverse);
		try {
			input.close();
		}
		catch (Exception e){
			System.out.println("Soething went wrong!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
	}

}
