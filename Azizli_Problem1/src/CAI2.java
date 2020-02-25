import java.util.Random;
import java.util.Scanner;
public class CAI2 {

	
	private static int AskQuestion() {
		Random number = new Random();
		int num1 = number.nextInt(10);
		int num2 = number.nextInt(10);
	System.out.println("What is "+num1+" times " +num2+" ");
	 
	int CorrectAnswer = num1* num2;
	return CorrectAnswer;
	}
	
	public static void displayCorrectResponse() {
		Random selection = new Random();
		int selectionNumber = 1+selection.nextInt(4);

		switch (selectionNumber) {

		case 1: System.out.println("Very good");break;
		case 2: System.out.println("Excellent!");break;
		case 3: System.out.println("Nice Work!");break;
		case 4: System.out.println("Keep up the good work!");break;
	}
}

	public static void displayIncorrectResponse() {
		Random selection = new Random();
		int selectionNumber = 1+selection.nextInt(4);

		switch (selectionNumber) {

		case 1: System.out.println("No, please try again");break;
		case 2: System.out.println("Wrong. Try once more");break;
		case 3: System.out.println("Don't give up");break;
		case 4: System.out.println("No. Keep trying");break;
	}
}

	public static int readResponse() {
		Scanner in = new Scanner(System.in);
		int Response = in.nextInt();
		return Response;
	}
	
	public static void IsAnswerCorrect(int Answer) {
		Scanner in = new Scanner(System.in);
		int StudentAnswer = readResponse();
		while (StudentAnswer != Answer) {
			displayIncorrectResponse();
			StudentAnswer = readResponse();
			
		}
		displayCorrectResponse();
	}
	public static void quiz() {
    	IsAnswerCorrect(AskQuestion());
	}
	public static void main(String[] args) {
		quiz();
	}
}  
