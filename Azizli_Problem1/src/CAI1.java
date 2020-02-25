import java.util.Random;
import java.util.Scanner;
public class CAI1 {

	
	private static int AskQuestion() {
		Random number = new Random();
		int num1 = number.nextInt(10);
		int num2 = number.nextInt(10);
	System.out.println("What is "+num1+" times " +num2+" ");
	 
	int CorrectAnswer = num1* num2;
	return CorrectAnswer;
	}
	
	public static void displayCorrectResponse() {
		System.out.println("Very good");
	}
	public static void displayIncorrectResponse() {
		System.out.println("No, please try again");
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
