import java.util.Random;
import java.util.Scanner;
public class CAI4 {

	
	private static int AskQuestion(int stage) {
		Random number = new Random();
		int num1 = number.nextInt(stage);
		int num2 = number.nextInt(stage);
	System.out.println("What is "+num1+" times " +num2+" ");
	 
	int CorrectAnswer = num1* num2;
	return CorrectAnswer;
	}
	public static int readDifficulty() {
		System.out.println("What type of difficulty level do you want between 1 to 4?");
		int Difficulty = readResponse();

		return Difficulty;
	}		
	public static int GenerateQuestionArgument(int stage) {
		
		double stageDouble = (int) stage;
		double ten = 10;
		int stageFinal  = (int)Math.pow(ten, stageDouble);
		
		
		return stageFinal;
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
	
	public static int IsAnswerCorrect(int CorrectAnswer) {
		Scanner in = new Scanner(System.in);
		int StudentAnswer = readResponse();
		if (StudentAnswer != CorrectAnswer) {
			displayIncorrectResponse();
			return 0;
		}
		displayCorrectResponse(); 
		return 1;
	}
	public static void displayCompletitionMessage(int total) {
		double percentage = (total/10)*100;
		System.out.println("Here is your result" +percentage +"");
		if (percentage >= 75) {
			System.out.println("Congratulations! you are ready to go to the " + "next level");
		}
	else if (percentage < 75) {
		System.out.println("Please ask your teacher for extra help");
	}
	}
	
	public static void quiz() {
		int  level = GenerateQuestionArgument(readDifficulty());
		int total =0;
		for (int counter = 0; counter <=10; counter++)
		{
			total += IsAnswerCorrect(AskQuestion(level));
		}
		displayCompletitionMessage(total);

	}
	public static void main(String[] args) {
		quiz();
	}
}   