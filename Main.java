import java.util.Scanner;

public class Main {
	private static String FizzBuzz(int num) {
	    if (num % 5 == 0 && num % 3 == 0) {
	        return "FizzBuzz";
	    }
	    else if (num % 3 == 0) {
	        return "Buzz";
	    }
	    else if (num % 5 == 0) {
	        return "Fizz";
	    }
	    else {
	        return String.valueOf(num);
	    }
	}
	
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.print("Number: ");
		final int x = scannerObj.nextInt();
		System.out.println(FizzBuzz(x));
	}
}
