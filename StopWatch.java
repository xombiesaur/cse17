/*
CSE 17
David Brewster
DCB316
Homework 2 	DEADLINE: September 7th, 2014
Program Discription; Stop Watch And Math Test
*/
import java.util.*;
import java.io.*;
public class StopWatch {
	public boolean running;
	public static long startTime;
	public int timedMs;
	static StopWatch ProgramStart = null;

	public StopWatch(){
		Date quizStart = new Date();
		startTime = quizStart.getTime();
		timedMs = 0;
		running = false;
	}
	public long getOldTime(){
		return startTime;
	}
	/* Main method that starts the user interface
	*/
	
	public static void main(String [] args) {
		StopWatch ProgramStart = new StopWatch();
		long oldTime = ProgramStart.getOldTime();
		userInterface(oldTime);
		
	}
	/* Asks the user for their name and starts the quiz
	*/
	public static void userInterface(long oldTime){
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your name:  ");
		String userName = console.next();
		System.out.println("Hello " + userName +"\nHow many Multiplication problems would you like?");
		int quizLoop = console.nextInt();
		String quizStartTime = getElapsedTime();
		System.out.println( "quiz started after " + quizStartTime);
		quiz(quizLoop, console);   	
	}
	/* creates a quiz for the user*/
	public static void quiz(int quizLoop,Scanner console){
		Random rand = new Random();
		for (int i= 0; i<quizLoop;i++){
			int a = rand.nextInt(10);
			int b = rand.nextInt(10);
			System.out.println("\nWhat is " +a+ " times " +b+ "?");
			int c = console.nextInt();
			if (c == (a*b)){
				System.out.print("Correct! ");
				String elapsedTime = getElapsedTime();
				System.out.print(" Question took " + elapsedTime);
			}
			else {
				System.out.print("Incorrect, sorry. ");
				String elapsedTime = getElapsedTime();
				System.out.print(" Question took " + elapsedTime);
			} 
		}
		
			 
	}
	/*checks to see how much time has passed since the start
	*/
	public static String getElapsedTime(){
    		Date checkTime = new Date();
    		long nowTime = checkTime.getTime();
    		long oldTime = startTime;
    		double seconds = (nowTime-oldTime) / 1000.0;
    		String second = String.format("%.2f",seconds); 
    		String elapsedTime = second + " seconds";
    		startTime = nowTime;
		return elapsedTime;
	}
	
}
